package com.linedata.ekip.pos.services.crma.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.linedata.ekip.pos.services.crma.service.ChiffrageService;

public class test {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/ChiffrageServiceImpl.spring.xml");

		ChiffrageService estimService = (ChiffrageService) ctx.getBean("ChiffrageService");
		
		estimService.ajout();

	}

}
