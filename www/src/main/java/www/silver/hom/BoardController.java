package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import www.silver.service.IF_BoardService;
import www.silver.util.FileDataUtil;
import www.silver.vo.BoardVO;
import www.silver.vo.Pagevo;

@Controller
public class BoardController {

	@Inject   
	IF_BoardService boardservice;
	
	@Inject
	FileDataUtil filedatautil;
	
	@GetMapping(value = "board")
	public String board(Model model, 
			@ModelAttribute Pagevo pagevo) throws Exception{
		//Controller  > service > dao > mapper
		if(pagevo.getPage()==null) {
			pagevo.setPage(1);
		}
		//3가지 정보만 있으면 페이지 계산이 가능
		//1 현재 페이지,, 2, 페이지당 게시물 수  3.전체페이지 수
		pagevo.setTotalCount(boardservice.totalCountBoard());		
		// 확인용
		//System.out.println(pagevo.getStartNo() +"시작 글번호");
		//System.out.println(pagevo.getEndNo() +"마지막 글번호");
		//System.out.println(pagevo.getStartPage() +"그룹 시작번호");
		//System.out.println(pagevo.getEndPage() +"그룹 끝 번호");
		System.out.println(pagevo.getSearchKeyword());
		
		// 서비스 layer에 전체글 서비스를 요청하고 결과를 리턴
		List<BoardVO> list = boardservice.boardList(pagevo);
		// 단위테스트
		//System.out.println(list.size() +"건 가져옴");
		// 리턴받은 list변수의 값을 모델 객체로 뷰에게 전송하는 코드
		model.addAttribute("list", list);
		// 뷰를 지정
		return "board/bbs";
	}
	@GetMapping(value = "bwr")
	public String bwr() throws Exception{
		//System.out.println("why?");
		return "board/bbswr";
	}
	
	@GetMapping(value="del")
	public String del(@RequestParam("delno") String delno) throws Exception {
		boardservice.deleteBoard(delno);
		return "redirect:board";
	}
	@PostMapping(value="mod")
	public String modsave(@ModelAttribute BoardVO boardvo)throws Exception{
		//System.out.println(bvo.getTitle());
		boardservice.modBoard(boardvo);
		return "redirect:board";
	}
	@GetMapping(value="mod")
	public String mod(@RequestParam("modno") String modno, Model model
			)throws Exception{
		BoardVO bvo = boardservice.modBoard(modno);
		// System.out.println(bvo.getTitle());
		// sysout은 서버 입장에서는 부하 걸리는 작업이다 
		// 그래서 테스트 했다면 삭제하거나 주석를 해야 한다. 
		// 실제로 sysout은 잘 사용하지 않는다.
		// 테스트 하기 위해서는  junit test라는 도구를 사용한다.
		// 또 기록을 남기위해서는 로그라는 기능을 사용한다.
		// 로그는 홈 컨트롤러에 가면 볼 수 있다. 
		model.addAttribute("boardvo", bvo);
		return "board/modform";
	}
	
	@PostMapping(value = "bwrdo")
	public String bwrdo(@ModelAttribute BoardVO boardvo,
			MultipartFile[] file) throws Exception{
		//System.out.println(boardvo.toString());
		//업로드 되는지 확인 하는 중간 코드
		/*System.out.println(file.length);
		for(int i=0; i<file.length; i++) {
			System.out.println(file[i].getOriginalFilename());
		}*/
		
		String[] newFileName=filedatautil.fileUpload(file);
//		System.out.println(newFileName);
		boardvo.setFilename(newFileName);
		boardservice.addBoard(boardvo);
		return "redirect:board";
	}
	@GetMapping(value="view")
	public String boardView(@RequestParam("no") String no,
			Model model) throws Exception {
		BoardVO boardvo = boardservice.getBoard(no);
		//attach 가져오기
		List<String> attachList = boardservice.getAttach(no);
		//view에게 전송할 값 들.. 게시글과, 첨부파일 리스트
		model.addAttribute("boardvo", boardvo);
		model.addAttribute("attachList", attachList);		
		
		return "board/dview";
	}

}



















