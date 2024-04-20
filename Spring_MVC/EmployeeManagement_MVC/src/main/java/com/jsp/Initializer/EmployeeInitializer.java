package com.jsp.Initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jsp.Configure;

public class EmployeeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		
		return new Class[] {Configure.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		
		return new String[] {"/"};
	}

}
