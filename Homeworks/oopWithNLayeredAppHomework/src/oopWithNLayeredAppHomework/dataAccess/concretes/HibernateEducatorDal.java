package oopWithNLayeredAppHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.dataAccess.abstracts.IEducatorDal;
import oopWithNLayeredAppHomework.entities.Educator;

public class HibernateEducatorDal implements IEducatorDal{
	List<Educator> educators = new ArrayList<Educator>();
	
	public HibernateEducatorDal() {
		educators.add(new Educator(1,"Ali","Budak"));
		educators.add(new Educator(2,"Murat","Salih"));
		educators.add(new Educator(3,"Ahmet","Sarı"));
	}
	
	@Override
	public void add(Educator educator) {
		// Hibernate kodları
		educators.add(educator);
		System.out.println("Hibernate : (" + educator.getFirstName() + ") veritabanına eklendi.");
	}

	@Override
	public List<Educator> getAll() {
		// TODO Auto-generated method stub
		return educators;
	}

}
