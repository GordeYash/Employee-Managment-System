package com.employee.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.Dao.EmployeeRepository;
import com.employee.Entity.Employee;

@Controller
public class AddAndAllEmployee {
	
	@Autowired
	EmployeeRepository repo;
	
	@RequestMapping("/AddEmployee")
	public String  addEmployee(@ModelAttribute Employee e)
	{
		if(e.getFname()!=null) {
		System.out.println(e.toString());
		repo.save(e);
		}
		e=null;
		return "NewEmployee";
	}
	
	@RequestMapping("/AllEmployee")
	public String allEmployee(Model m)
	{
		List<Employee> list=repo.findAll();
		m.addAttribute("emp", list);
		
		return "AllEmployee";
	}
	
	@RequestMapping("/DelEmployee")
	public String delEmployee(@ModelAttribute("id") int id)
	{
		System.out.println(id);
		repo.deleteById(id);
		return "redirect:/AllEmployee";
	}
	
	@RequestMapping("/UpdateEmployee")
	public String updateEmployee(Model m,@ModelAttribute("id") int id)
	{
		Employee emp=repo.getById(id);
		System.out.println(id);
		m.addAttribute("emp", emp);
		
		return "UpdateEmployee";
	}

	@RequestMapping("/update")
	public String dataUpdate(@ModelAttribute Employee emp)
	{
		repo.save(emp);
		return "redirect:/AllEmployee";
	}
}
