package com.thefranchise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LandingPageController {
	@RequestMapping("")
	public String page(){
		return "html/landingpage";
	}

	
}
