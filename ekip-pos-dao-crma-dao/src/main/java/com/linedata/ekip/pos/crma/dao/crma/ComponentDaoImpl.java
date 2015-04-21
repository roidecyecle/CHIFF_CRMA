package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.ComponentDao;
import com.linedata.ekip.pos.dao.model.impl.Component;

@Repository
@Transactional
public class ComponentDaoImpl implements ComponentDao{
	
	private EntityManager em;

	@Override
	public void addComponent(Component component) {
		em.persist(component);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
