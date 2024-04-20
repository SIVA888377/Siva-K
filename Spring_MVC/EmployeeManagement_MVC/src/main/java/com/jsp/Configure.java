package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class Configure 
{
	@Bean
	public EntityManager getEntiryManager()
	{
		EntityManagerFactory factrory=Persistence.createEntityManagerFactory("dev");
		return factrory.createEntityManager();
	}
	
	@Bean
	public EntityTransaction getEntiryTransation()
	{
		EntityManager manager=getEntiryManager();
		return manager.getTransaction();
	}
	
	
}
