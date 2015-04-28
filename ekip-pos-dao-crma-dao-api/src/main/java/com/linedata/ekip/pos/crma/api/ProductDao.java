package com.linedata.ekip.pos.crma.api;

import java.util.List;

import com.linedata.ekip.pos.dao.model.impl.Product;

public interface ProductDao {

	public ProductDao addProduct(Product product);
	public boolean removeProduct(long idProduct);
	public boolean updatePoduct(long idProduct);
	public ProductDao findProductByLabel(String label);
	public List<ProductDao> findAllProduct();
	public Product getProduct(long idProduct);
}
