package com.SpringSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {

	// when login by default ;Password=d57f1cdb-c7d2-4448-9290-019dee5e05f7
	@RequestMapping("/")
	public String home() {
		return "<h1>Welcome</h1>";
	}
	
	@RequestMapping("/user")
	public String userHome() {
		return "<h1>Welcome user</h1>";
	}
	
	@RequestMapping("/admin")
	public String adminHome() {
		return "<h1>Welcome admin</h1>";
	}
}
