package com.employee.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendMailController {
	
	@RequestMapping("/SendMails")
	public String sendMails()
	{
		return "Mails";
	}

}
