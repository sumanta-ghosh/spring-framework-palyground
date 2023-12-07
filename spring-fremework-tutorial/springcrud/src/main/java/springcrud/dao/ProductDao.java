package springcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springcrud.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}

	// Read
	public List<Product> getProducts() {
		return this.hibernateTemplate.loadAll(Product.class);
	}

	// Read
	public Product getProduct(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}

	// Update
	@Transactional
	public void updateProduct(Product product) {
		this.hibernateTemplate.update(product);
	}

	@Transactional
	// Delete
	public void delete(int id) {
		Product product = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(product);
	}
}
