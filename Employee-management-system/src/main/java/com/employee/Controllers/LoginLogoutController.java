package com.employee.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.Entity.LoginData;

@Controller
public class LoginLogoutController {
	
	
	@Autowired
	com.employee.Dao.Login Login;

	@RequestMapping("/")
	public String Login(@ModelAttribute LoginData login)
	{
		if(login!=null) {
			LoginData data=Login.findByEmailAndPassword(login.getEmail(),login.getPassword());
		//System.out.println(data.toString());
			if(data!=null)
				return "redirect:/Home";
		}
		
		return  "Login";
	}
	
	
	@RequestMapping("/SignUp")
	public String signUp(@ModelAttribute LoginData login)
	{
		if(login.getEmail()!=null) {
			Login.save(login);
			return "redirect:/";
		}
		
		return "SignUp";
	}

}
