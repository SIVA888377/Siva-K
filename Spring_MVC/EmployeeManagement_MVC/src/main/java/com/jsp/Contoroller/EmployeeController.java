package com.jsp.Contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@Controller
public class EmployeeController 
{
	
	@Autowired
	EmployeeDao dao;
	
	//To insert the object
	@RequestMapping("/add")
	public ModelAndView saveEmplopyee()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("addEmployee.jsp");
		return mv;
	}
	
	@RequestMapping("/create")
	public ModelAndView createEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView view=new ModelAndView();
		view.setViewName("index.jsp");
		return view;
	}

	
	
	//To search the Single Object
	@RequestMapping("/search")
	public ModelAndView getEmp()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("getEMP.jsp");
		return mv;
	}
	
	@RequestMapping("/view")
	public ModelAndView getEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView view=new ModelAndView();
		Employee e=dao.findEmployee(employee.getId());
		view.addObject("employee", e);
		view.setViewName("display.jsp");
		return view;
	}
	
	
	
	//To delete the object
	@RequestMapping("/delete")
	public ModelAndView deleteEmp()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("deleteEmp.jsp");
		return mv;
	}
	
	@RequestMapping("/remove")
	public ModelAndView deleteEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView view=new ModelAndView();
		dao.removeEmployee(employee.getId());
		view.setViewName("index.jsp");
		return view;
	}
	
	
	
	//To update Employee details
	@RequestMapping("/update")
	public ModelAndView updateEmp()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("updateEmp.jsp");
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView view=new ModelAndView();
		dao.updateEmployee(employee);
		view.setViewName("index.jsp");
		return view;
	}
	
	
	
	
	//To display all the Object
	@RequestMapping("/displayAll")
	public ModelAndView dispalyAll()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList", dao.getAllEmp());
		mv.setViewName("displayAll.jsp");
		return mv;
	}
	
	
	
}











