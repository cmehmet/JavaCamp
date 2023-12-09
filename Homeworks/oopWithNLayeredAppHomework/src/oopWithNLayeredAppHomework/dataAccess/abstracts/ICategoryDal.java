package oopWithNLayeredAppHomework.dataAccess.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Category;

public interface ICategoryDal {
	void add(Category category);
	List<Category> getAll();
}
