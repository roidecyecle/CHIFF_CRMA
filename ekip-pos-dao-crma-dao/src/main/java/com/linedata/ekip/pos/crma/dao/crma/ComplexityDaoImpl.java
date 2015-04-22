package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.ComplexityDao;
import com.linedata.ekip.pos.dao.model.impl.Complexity;

@Repository
@Transactional
public class ComplexityDaoImpl implements ComplexityDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Complexity addComplexity(Complexity complexity) {
		em.persist(complexity);
		return complexity;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
