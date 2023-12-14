package oopWithNLayeredAppHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class JdbcCategoryDal implements ICategoryDal {
	List<Category> categories = new ArrayList<Category>();
	
	public JdbcCategoryDal() {
		categories.add(new Category(1,"Tümü"));
		categories.add(new Category(2,"Programlama"));
		categories.add(new Category(3,"Tasarım"));
		// Database simulation for business rules
	}
	
	@Override
	public void add(Category category) {
		// database codes
		categories.add(category);
		System.out.println("JDBC : Kategori (" + category.getCategoryName() + ") Kategori ekledi.");
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}

}
