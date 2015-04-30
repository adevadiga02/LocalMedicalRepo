package com.local.medical.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.local.medical.dao.LocalMedicalDao;
import com.local.medical.entity.User;
import com.local.medical.services.LocalMedicalService;



@Controller
public class LocalMedicalController {

	@Autowired
	@Qualifier("localMedicalService")
	private LocalMedicalService localMedicalService;
	
	//TO AUTHENTICATE USER
	@RequestMapping(method={RequestMethod.POST}, value="/auth.do")		
	public String authenticate(@RequestParam("name") String name,@RequestParam("pass") String password)
	{
		String authUser = localMedicalService.authUser(name, password);
		
		String returnToPage = "";
		
		if(authUser.equals("success")){
			returnToPage ="landingPage.jsp";
		}
		
		return returnToPage;
	}
	
}
