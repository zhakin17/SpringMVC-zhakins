package kz.zhakins.app.services;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import kz.zhakins.app.interfaces.IProductService;
import kz.zhakins.app.model.Product;

@Service
public class ProductService implements IProductService {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public boolean insProduct(Product product) {
		
		String sql="INSERT into \"D_PRODUCT\"(\"NAME\", \"DESCRIPTION\" ) values (?,?)";
		
		int row =jdbcTemplate.update(sql, new Object[]{product.getName(),product.getDescription()});
		
		return (row !=0) ? true:false;
	}

	@Override
	public void updProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getProductByName(String name) {
		
		String sql = "SELECT * FROM \"D_PRODUCT\"";
		
		List<Product> listProduct = new ArrayList();
		
		listProduct = jdbcTemplate.query(sql, new ProductMapper());
		
		
		
		
		return listProduct;
	}

	@Override
	public Product getProductByID(Long id) {
		
		String sql = "SELECT *  FROM \"D_PRODUCT\" where id=?";
		
		 
		return jdbcTemplate.queryForObject(sql, new ProductMapper(),id);
	}

	

}
