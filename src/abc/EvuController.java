package abc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/evu")
public class EvuController 
{
	 
	   @RequestMapping(method = RequestMethod.GET)public String evan(ModelMap model) {
		      model.addAttribute("message", "Hello evu");
		      model.addAttribute("abc", "Hello chandra ji");
		      return "evu";
		   }

}

