package com.lean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/release")
public class ReleaseContoller {

	@RequestMapping("/region")
	public String listRegion(Model theModel) {
		return "list-Region";
	}
}	
