package oopWithNLayeredAppHomework.dataAccess.concretes;

import oopWithNLayeredAppHomework.dataAccess.abstracts.IEducatorDal;
import oopWithNLayeredAppHomework.entities.Educator;

public class JdbcEducatorDal implements IEducatorDal{

	@Override
	public void add(Educator educator) {
		// JDBC kodları
		System.out.println("JDBC : Eğitmen (" + educator.getFirstName() + " " + educator.getLastName() + ") veritabanına eklendi.");
		
	}

}
