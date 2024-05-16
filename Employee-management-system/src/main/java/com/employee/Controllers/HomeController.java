package com.employee.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		
		
		@RequestMapping("/Home")
		public String Home()
		{
			return "Home";
		}
		
		
		@RequestMapping("/AboutUs")
		public String aboutUs()
		{
			return "AboutUs";
		}
}
