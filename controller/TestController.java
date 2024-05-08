package com.evanesce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	   
		@GetMapping("/bye")
		public String test() {
			return "HI";
		}
}
