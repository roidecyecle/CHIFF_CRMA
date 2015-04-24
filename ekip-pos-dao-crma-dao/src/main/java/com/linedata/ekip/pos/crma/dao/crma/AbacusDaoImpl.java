package com.linedata.ekip.pos.crma.dao.crma;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.AbacusDao;
import com.linedata.ekip.pos.dao.model.impl.Abacus;
import com.linedata.ekip.pos.dao.model.impl.Complexity;
import com.linedata.ekip.pos.dao.model.impl.Component;

@Repository
@Transactional
public class AbacusDaoImpl implements AbacusDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean addElement(Abacus abacus, long idComponent, long idComplexity) {
		Component component = em.find(Component.class, idComponent);
		Complexity complexity = em.find(Complexity.class, idComplexity);
		abacus.setComponent(component);
		abacus.setConplexity(complexity);
		em.persist(abacus);
		return true;
	}

	@Override
	public boolean updateElement(long idAbacus,long idComponent, long idComplexity) {
		Component component = em.find(Component.class, idComponent);
		Complexity complexity = em.find(Complexity.class, idComplexity);
		Abacus abacus = em.find(Abacus.class, idAbacus);
		abacus.setComponent(component);
		abacus.setConplexity(complexity);
		em.merge(abacus);
		return true;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public boolean removeElement(long idAbacus) {
		Abacus abacus = em.find(Abacus.class, idAbacus);
		em.remove(abacus);
		return true;
	}

	@Override
	public Abacus getAbacusElements(long idAbacus) {
		Abacus abacus = em.find(Abacus.class, idAbacus);
		return abacus;
	}

}
