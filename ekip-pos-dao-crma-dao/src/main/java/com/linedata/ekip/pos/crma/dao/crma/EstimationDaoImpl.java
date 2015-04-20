package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.EstimationDao;
import com.linedata.ekip.pos.dao.model.impl.Author;
import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.Subject;

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
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
