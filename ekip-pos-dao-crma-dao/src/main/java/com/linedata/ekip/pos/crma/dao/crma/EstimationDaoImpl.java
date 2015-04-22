package com.linedata.ekip.pos.crma.dao.crma;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.EstimationDao;
import com.linedata.ekip.pos.dao.model.impl.Author;
import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.Subject;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

@Repository
@Transactional
public class EstimationDaoImpl implements EstimationDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Estimation addEstimation(Estimation estimation, long idAuthor, long idSubject) {
		Author author = em.find(Author.class, idAuthor);
		Subject subject = em.find(Subject.class, idSubject);
		estimation.setAuthor(author);
		estimation.setSubject(subject);
		em.persist(estimation);
		return estimation;
	}
	


	@Override
	public List<UnitOfWork> getAllUnits(long idEstimation) {
		Query req=em.createQuery("select u from UnitOfWork u where u.estimation.id=:x");
		req.setParameter("x", idEstimation);
		return req.getResultList();
	}


	@Override
	public Estimation getEstimation(long idEstimation) {
		Estimation est = em.find(Estimation.class, idEstimation);
		if(est==null) throw new RuntimeException("Estimation introuvable");
		return est;
	}


	@Override
	public List<Estimation> getAllEstimationByLabel(String label) {
		Query req=em.createQuery("select e from Estimation e where e.label like :x");
		req.setParameter("x", "%"+label+"%");
		return req.getResultList();
	}
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}




}
