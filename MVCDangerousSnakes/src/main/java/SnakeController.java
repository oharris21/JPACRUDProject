import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.dangeroussnakes.data.SnakeDAO;
import com.skilldistillery.dangeroussnakes.entities.Snake;

@Controller
public class SnakeController {
	@Autowired
	private SnakeDAO dao	; 
	
//	@RequestMapping(path="index.do")
//	public String index(Model model) {
//		return "homepage"; 
//	}
}
