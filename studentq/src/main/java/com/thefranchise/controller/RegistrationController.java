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
@RequestMapping(value = "/register")
public class RegistrationController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public String register(ModelMap modelMap){
		modelMap.put("account", new StudentAccount());
		return "html/account/register_john";
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public String register(@ModelAttribute("account") @Valid StudentAccount account,
			BindingResult bindingResult,
			ModelMap modelMap){
		
		if(bindingResult.hasErrors()){
			return "html/account/register";
		}else{
			modelMap.put("account", account);
			return "html/account/success";
		}
		
	}
}
