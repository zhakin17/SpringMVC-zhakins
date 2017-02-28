package kz.zhakins.app.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kz.zhakins.app.model.Product;

public class ProductMapper implements RowMapper<Product>  {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product = new Product();
		product.setId(rs.getLong("id"));
		product.setName(rs.getString("name"));
		product.setDescription(rs.getString("description"));
		
		return product;
	}

}
