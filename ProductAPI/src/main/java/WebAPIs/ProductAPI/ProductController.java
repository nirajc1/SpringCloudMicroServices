package WebAPIs.ProductAPI;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
	@GetMapping("/products")
	public List<Product> getProductList() {	
		
		//adding comments
		//adding second commit
		
	    String sql = "SELECT * FROM Product";	    
	    List<Product> products = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	    
		/*Product p1 = new Product("1","Oil");
		Product p2 = new Product("2","Soap");
		Product p3 = new Product("3","Shampoo");
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);		 */
		
		
		return products;
		
		
		
	}

}
