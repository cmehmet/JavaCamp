package oopWithNLayeredAppHomework.business.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Category;

public interface ICategoryService {
	void add(Category category) throws Exception;
	List<Category> getAll();
}
