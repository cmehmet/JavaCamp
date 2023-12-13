package oopWithNLayeredAppHomework.business.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Educator;

public interface IEducatorService {
	void add(Educator educator);
	List<Educator> getAll();
}
