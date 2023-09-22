package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	@GetMapping("jii")
	public String hiigii() {
		return "Jii eppo varuvunga";
	}
	
}
