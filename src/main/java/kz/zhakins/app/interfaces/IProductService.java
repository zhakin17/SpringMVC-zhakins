package kz.zhakins.app.interfaces;

import java.util.List;

import kz.zhakins.app.model.Product;

public interface IProductService {
	
	public boolean insProduct(Product product);
	
	public void updProduct(Product product);
	
	public void delProduct(Product product);
	
	public List<Product> getProductByName(String name);
	
	public Product getProductByID(Long id);
	
}
