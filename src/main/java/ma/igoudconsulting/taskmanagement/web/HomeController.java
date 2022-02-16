package ma.igoudconsulting.taskmanagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index () {
		return "/login";
		
	}
	
	@GetMapping("/login")
	public String login () {
		return "/login";
		
	}
	
	@PostMapping("/login")
	public String logMeIn () {
		return "/login";
		
	}


}
