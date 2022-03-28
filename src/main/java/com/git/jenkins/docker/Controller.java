package com.git.jenkins.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cicd")
@RestController
public class Controller {
	
	@GetMapping("/jenkins")
	public String he() {
		return "Hello Inside Jenkins";
	}

}
