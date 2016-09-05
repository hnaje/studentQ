package com.thefranchise.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thefranchise.model.StudentAccount;


@Controller
@RequestMapping(value = "/questionPage")
public class QuestionPageController {
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String questionPage(ModelMap modelMap){
	return "html/questionPage";
}
}


