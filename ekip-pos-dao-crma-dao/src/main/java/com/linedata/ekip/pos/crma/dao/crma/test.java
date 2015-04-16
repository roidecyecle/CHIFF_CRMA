package com.linedata.ekip.pos.crma.dao.crma;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.Subject;







public abstract class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		BaseDaoImpl dao = ctx.getBean("baseDaoImpl", BaseDaoImpl.class);
		
		dao.addSubject(new Subject("test description", "11", new Date(), "44"));
		
	}

}
