package oopOdev.dataAccess.concretes;

import oopOdev.dataAccess.abstracts.ICategoryDal;
import oopOdev.entities.Category;

public class JdbcCategoryDal implements ICategoryDal {

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC : (" + category.getCategoryName() + ")Kategori ekledi.");
		
	}

}
