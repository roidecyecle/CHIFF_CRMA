package com.linedata.ekip.pos.crma.dao.crma;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.linedata.ekip.pos.crma.api.ProductDao;
import com.linedata.ekip.pos.dao.model.impl.Product;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public ProductDao addProduct(Product product) {
		em.persist(product);
		return null;
	}

	@Override
	public boolean removeProduct(long idProduct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePoduct(long idProduct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductDao findProductByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDao> findAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
