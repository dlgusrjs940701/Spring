package www.silver.hom;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.service.IF_MemberService;
import www.silver.vo.MemberVO;

@Controller
public class LoginController {
	@Inject  // 주입 받기 위해서는 아래의 객체가 컨트롤러에 있어야 한다.
	IF_MemberService memberservice; 
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request
			)throws Exception{
		HttpSession session = request.getSession();
		session.invalidate();  //세션을 무력화
		return "redirect:/";
	}
	@PostMapping("login")
	public String login(@RequestParam("id") String id,
			@RequestParam("pass") String pass,
			HttpServletRequest request)throws Exception{
		//클라이언트가 전송한 아이디와 패스워드가 디비에 있는지 확인
		//현재는 세션과 인터셉터가 목적이라서 윗 부분은 생략하고 진행
		// 아래 코드는 데이터베이스에서 가져온 값이 있을 경우만 실행되어야 함
		MemberVO nowUser = memberservice.selectOne(id);
		boolean flag=true;
		if(nowUser != null) {
			if(nowUser.getPass().equals(pass)) {
				// reqeust의 세션을 가져온다.
				HttpSession session = request.getSession();
				// 가져온 세션에 설정된 id변수의 값을 가져온다.
				Object nowid = session.getAttribute("id");
				// 만약 가져온 값이 있다면
				if(nowid != null) {
					// 기존의 세션값의 id변수의 값을 제거한다.
					session.removeAttribute("id");
				}
				// 세션에 변수 id를 저장한다. 
				session.setAttribute("id", id);
				flag=false;
			}
		}	
		if(flag) {
			return "redirect:/?msg=2";
		}else {
			return "redirect:/";
		}
	}

}
