package com.jsp.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Employee;

@Repository
public class EmployeeDao 
{
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	public void saveEmployee(Employee employee )
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
	}
	
	public Employee findEmployee(int id)
	{
		Employee e=manager.find(Employee.class,id);
		return e;
	}
	
	public void removeEmployee(int id)
	{
		Employee emp=manager.find(Employee.class, id);
		transaction.begin();
		manager.remove(emp);
		transaction.commit();
	}
	
	
	public void updateEmployee(Employee emp)
	{
		Employee exitEmp=findEmployee(emp.getId());
		if(exitEmp!=null)
		{
			transaction.begin();
			manager.merge(emp);
			transaction.commit();
		}
	}
	
	
	public List<Employee> getAllEmp()
	{
		
		Query q=manager.createQuery("select e from Employee e");
		List<Employee> empList=q.getResultList();
		return empList;
		
	}
	
	
	
}
