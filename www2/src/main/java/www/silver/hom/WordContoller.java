package www.silver.hom;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordContoller {

	@RequestMapping(value = "word", method = RequestMethod.GET)
	public String afdasf(Model model) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("car", "자동차");
		model.addAttribute("list", map);
		return "word/word";
	}

	@RequestMapping(value = "result", method = RequestMethod.GET)
    public String result(@RequestParam("word") String word, Model model) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("apple", "사과");
        map.put("banana", "바나나");
        map.put("car", "자동차");

        String kor = map.get(word);
        if (kor != null) {
            model.addAttribute("word", word);
            model.addAttribute("mean", kor);
        } else {
            model.addAttribute("error", "단어를 찾을 수 없습니다.");
        }
        return "word/result";  
    }
}
