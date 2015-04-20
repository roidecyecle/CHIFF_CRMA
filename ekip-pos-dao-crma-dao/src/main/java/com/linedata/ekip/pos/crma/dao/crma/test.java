package com.linedata.ekip.pos.crma.dao.crma;


import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linedata.ekip.pos.crma.api.AuthorDao;
import com.linedata.ekip.pos.crma.api.EstimationDao;
import com.linedata.ekip.pos.crma.api.ProductDao;
import com.linedata.ekip.pos.crma.api.SubjectDao;
import com.linedata.ekip.pos.crma.api.UnitOfWorkDao;
import com.linedata.ekip.pos.dao.model.impl.Author;
import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.Product;
import com.linedata.ekip.pos.dao.model.impl.Subject;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;



public abstract class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		SubjectDao subjectDao = (SubjectDao) ctx.getBean("subjectdao");
		AuthorDao authorDao = (AuthorDao) ctx.getBean("authordao");
		EstimationDao estimationDao = (EstimationDao) ctx.getBean("estimationdao");
		UnitOfWorkDao unitOfWorkDao = (UnitOfWorkDao) ctx.getBean("unitofworkdao");
		

		Product p = new Product();
		p.setLabel("EKIP V7");
		productDao.addProduct(p);
		
		Subject s = new Subject("Test unitaire", "1.2", Calendar.getInstance().getTime(), "1.0");
		subjectDao.addSubject(s,p.getId());
		
		Author a = new Author();
		a.setName("Raed");
		a.setFunction("Directeur de pole");
		authorDao.addAuthor(a);
		
		
		UnitOfWork unit1 = new UnitOfWork("unite 1", 1);
		UnitOfWork unit2 = new UnitOfWork("unite 2", 5);
		UnitOfWork unit3 = new UnitOfWork("unite 3", 5.5F);
		UnitOfWork unit4 = new UnitOfWork("unite 4", 7);
	
		Estimation est1 = new Estimation(Calendar.getInstance().getTime(),"DOCUMENT 1","Créer");
		Estimation est2 = new Estimation(Calendar.getInstance().getTime(),"DOCUMENT 2","Update");
		
		estimationDao.addEstimation(est1, a.getId(), s.getId());
		estimationDao.addEstimation(est2, a.getId(), s.getId());
		
		unitOfWorkDao.addUniOfWork(unit1, est1.getId());
		unitOfWorkDao.addUniOfWork(unit2, est2.getId());
		unitOfWorkDao.addUniOfWork(unit3, est2.getId());
		unitOfWorkDao.addUniOfWork(unit4, est1.getId());
		
		
	}

}
