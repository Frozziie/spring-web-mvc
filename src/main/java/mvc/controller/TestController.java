package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("deployment/test")
	public String deploymentTest() {
		return "Deployment Test";
	}
}
