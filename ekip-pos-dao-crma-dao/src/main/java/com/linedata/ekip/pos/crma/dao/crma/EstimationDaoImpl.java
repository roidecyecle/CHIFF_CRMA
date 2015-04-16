package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.EstimationDao;
import com.linedata.ekip.pos.dao.model.impl.Estimation;

@Repository
@Transactional
public class EstimationDaoImpl implements EstimationDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Estimation addEstimation(Estimation estimation) {
		if(em.find(Estimation.class, estimation.getId()) != null){
			System.out.println("Estimation existe");
		}
		else {
			em.persist(estimation);
		}
		return estimation;
	}
	
	
	
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
