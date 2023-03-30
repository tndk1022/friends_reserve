package com.ksj.friends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@GetMapping(value = "/")
	public String goHome(HttpServletRequest request) {
		return "index";
	}
}
