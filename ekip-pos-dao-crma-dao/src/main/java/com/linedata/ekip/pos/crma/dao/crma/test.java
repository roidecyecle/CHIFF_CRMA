package com.linedata.ekip.pos.crma.dao.crma;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linedata.ekip.pos.crma.api.AbacusDao;
import com.linedata.ekip.pos.crma.api.ActionTypeDao;
import com.linedata.ekip.pos.crma.api.AuthorDao;
import com.linedata.ekip.pos.crma.api.ComplexityDao;
import com.linedata.ekip.pos.crma.api.ComponentDao;
import com.linedata.ekip.pos.crma.api.EstimationDao;
import com.linedata.ekip.pos.crma.api.ProductDao;
import com.linedata.ekip.pos.crma.api.SubjectDao;
import com.linedata.ekip.pos.crma.api.UnitOfWorkDao;
import com.linedata.ekip.pos.dao.model.impl.Abacus;
import com.linedata.ekip.pos.dao.model.impl.ActionType;
import com.linedata.ekip.pos.dao.model.impl.Author;
import com.linedata.ekip.pos.dao.model.impl.Complexity;
import com.linedata.ekip.pos.dao.model.impl.Component;
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
		ComponentDao componentDao = (ComponentDao) ctx.getBean("componentdao");
		ComplexityDao complexityDao = (ComplexityDao) ctx.getBean("complexitydao");
		AbacusDao abacusDao = (AbacusDao) ctx.getBean("abacusdao");
		ActionTypeDao actionTypeDao = (ActionTypeDao) ctx.getBean("actiontypedao");
		

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
		
		Component comp = new Component("Block");
		componentDao.addComponent(comp);
		Component comp2 = new Component("Screen");
		componentDao.addComponent(comp2);
		
		Complexity comx = new Complexity("facile");
		complexityDao.addComplexity(comx);
		
		ActionType action = new ActionType("Creation", 5);
		actionTypeDao.addActionType(action);
		
		
		Abacus abac = new Abacus(5.2F);
		Abacus abac2 = new Abacus(5.2F);
		
		abacusDao.addElement(abac, comp.getId(), comx.getId());
		abacusDao.addElement(abac2, comp2.getId(), comx.getId());
		
		unitOfWorkDao.addUniOfWork(unit1, est1.getId(),action.getId(),abac.getIdAbacus());
		unitOfWorkDao.addUniOfWork(unit2, est2.getId(),action.getId(),abac.getIdAbacus());
		unitOfWorkDao.addUniOfWork(unit3, est1.getId(),action.getId(),abac.getIdAbacus());	
		unitOfWorkDao.addUniOfWork(unit4, est1.getId(),action.getId(),abac.getIdAbacus());
		
		
		ArrayList<UnitOfWork> list = (ArrayList<UnitOfWork>) estimationDao.getAllUnits(est2.getId());
		ArrayList<Estimation> list2 = (ArrayList<Estimation>) estimationDao.getAllEstimationByLabel("");
		
		for(int i=0; i<=list.size();i++){
			System.out.println(list2.get(i).getlabel());
		}
		
		System.out.println(estimationDao.getEstimation(est2.getId()).getUnitsOfWork().size());
		

	}

}
