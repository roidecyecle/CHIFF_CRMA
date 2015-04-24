package com.linedata.ekip.pos.crma.dao.crma;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.ActionTypeDao;
import com.linedata.ekip.pos.dao.model.impl.ActionType;
import com.linedata.ekip.pos.dao.model.impl.UnitOfWork;

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
	
	
	
	
	@Override
	public ActionType updateActionType(ActionType actionType) {
		em.merge(actionType);
		return actionType;
	}
	@Override
	public boolean removeActionType(ActionType actionType) {
		em.remove(actionType);
		return true;
	}
	@Override
	public ActionType getActionType(long idAction) {
		ActionType action = em.find(ActionType.class,idAction);
		return action;
	}
	@Override
	public List<UnitOfWork> getUnitsByAction(long idAction) {
		Query req=em.createQuery("select u from UnitOfWork u where u.actionType.id=:x");
		req.setParameter("x", idAction);
		return req.getResultList();
		
	}

}
