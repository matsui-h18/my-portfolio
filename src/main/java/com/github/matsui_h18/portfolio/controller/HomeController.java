package com.github.matsui_h18.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	@GetMapping("/")
	public String index() {
		// index.htmlに画面遷移
		return "index";
	}
}
