package www.silver.hom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("logout")
	public String logout(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		session.invalidate();  // 세션을 무력화시킴
		return "redirect:/";
	}

	@PostMapping("login")
	// 클라이언트가 전송한 아이디와 패스워드가 디비에 잇는지 확인
	// 현재는 세션과 인터셉터가 목적이라서 윗 부분은 생략하고 진행
	public String login(@RequestParam("id") String id, @RequestParam("pass") String pass, HttpServletRequest request)
			throws Exception {

		if (true) {
			HttpSession session = request.getSession();
			// 가져온 세션에 설정된 id변수의 값을 가져온다.
			Object nowid = session.getAttribute(id);
			// 만약 가져온 값이 있다면
			if (nowid != null) {
				// 기존의 세션값의 id변수의 값을 제거한다.
				session.removeAttribute(id);
			}
			// 세션에 변수 id를 저장한다.
			session.setAttribute("id", id);

		}
		return "redirect:/";
		// 아래 코드는 데이터베이스에서 가져온 값이 있을경우만 실행
		// request의 세션을 가져온다.
	}
}
