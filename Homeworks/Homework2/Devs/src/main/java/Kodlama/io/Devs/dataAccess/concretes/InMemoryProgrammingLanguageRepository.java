package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	public List<ProgrammingLanguage> programmingLanguages = new ArrayList<ProgrammingLanguage>();

	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages.add(new ProgrammingLanguage(0,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Python"));
	}
	
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguages.get(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}


	@Override
	public void delete(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguages.get(id);
		programmingLanguages.remove(programmingLanguage);
	}


	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage programmingLanguageItem = new ProgrammingLanguage();
		programmingLanguageItem = programmingLanguages.get(programmingLanguage.getId());
		programmingLanguageItem.setName(programmingLanguage.getName());
	}
	
	

}
