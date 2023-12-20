package oopWithNLayeredAppHomework.dataAccess.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Educator;

public interface IEducatorDal {
	void add(Educator educator);
	List<Educator> getAll();
	
}
