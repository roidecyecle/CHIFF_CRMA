package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.ActionTypeDao;
import com.linedata.ekip.pos.dao.model.impl.ActionType;

@Repository
@Transactional
public class ActionTypeDaoImpl implements ActionTypeDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public ActionType addActionType(ActionType actionType) {
		em.persist(actionType);
		return actionType;
	}
	public EntityManager getEm() {
		return em;
	}
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
