package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_BoardService;
import www.silver.vo.BoardVO;

@Controller
public class BoardController {

	@Inject
	IF_BoardService boardservice;
	
	@GetMapping(value = "board")
	public String board(Model model) throws Exception {
		// Controller > service > dao > mapper
		// 서비스 layer에 전체글 서비스를 요청하고 결과를 리턴
		List<BoardVO> list = boardservice.boardList();
//		 단위 테스트
		System.out.println(list.size() + "건 가져옴");
		// 리턴받은 list 변수의 값을 모델 객체로 뷰에게 전송하는 코드
		model.addAttribute("list", list);
		// 뷰를 지정하는 코드
		return "board/board";
	}
	
	@GetMapping(value="boardwrite")
	public String boardwrite() throws Exception {
		
		return "board/boardwrite";
	}
	
	@PostMapping(value = "boardwritedo")
	public String bwrdo(@ModelAttribute BoardVO boardvo) throws Exception {
		// System.out.println(boardvo.toString());
		boardservice.addBoard(boardvo);
		return "board/bbs";
	}
}
