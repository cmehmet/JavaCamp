package oopWithNLayeredAppHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class HibernateCategoryDal implements ICategoryDal{
	List<Category> categories;
	
	public HibernateCategoryDal() {
		categories = new ArrayList<Category>();
		categories.add(new Category(1,"Tümü"));
		categories.add(new Category(2,"Programlama"));
		categories.add(new Category(3,"Tasarım"));
	}
	@Override
	public void add(Category category) {
		// database codes
		System.out.println("Hibernate : Kategori (" + category.getCategoryName() + ")veritabanına eklendi.");
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}

}
