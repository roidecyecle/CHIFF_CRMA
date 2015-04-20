package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.UnitOfWorkDao;
import com.linedata.ekip.pos.dao.model.impl.Estimation;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

@Repository
@Transactional
public class UnitOfWorkDaoImpl implements UnitOfWorkDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public UnitOfWork addUniOfWork(UnitOfWork unit, Long idEstimation) {
		Estimation estimation = em.find(Estimation.class, idEstimation);
		unit.setEstimation(estimation);
		em.persist(unit);
		return unit;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
