package com.employee.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.Entity.Leave;

@Controller
public class LeaveController {
	@Autowired
	com.employee.Dao.Leave lev;

	@RequestMapping("/AllowLeave")
	public String allowLeave(@ModelAttribute Leave leave) {
		if (leave.getPhone() != null) {
			lev.save(leave);
			System.out.println(leave.toString());
		}
		return "AllowLeave";
	}

	@RequestMapping("/AllLeaves")
	public String allLeave(Model m) {
		List<Leave> leave = lev.findAll();
		System.out.println(leave.toString());
		m.addAttribute("leaves", leave);

		return "AllLeaves";
	}
	@RequestMapping("/DelLeave")
	public String deleteEmployee(@ModelAttribute("id") int id)
	{
		lev.deleteById(id);
		return "redirect:/AllLeaves";
	}
	

}
