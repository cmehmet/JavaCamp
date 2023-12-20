package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageTechnologyRepository;
import Kodlama.io.Devs.entitites.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entitites.concretes.ProgrammingLanguageTechnology;

@Service
public class ProgrammingLanguageTechnologyManager implements ProgrammingLanguageTechnologyService  {
	private ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageTechnologyManager(ProgrammingLanguageTechnologyRepository programmingLanguageTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageTechnologyRepository = programmingLanguageTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageTechnologiesResponse> getAll() {
		List<ProgrammingLanguageTechnology> programmingLanguageTechnologies = programmingLanguageTechnologyRepository.findAll();
		List<GetAllProgrammingLanguageTechnologiesResponse> programmingLanguageTechnologiesResponse = new ArrayList<GetAllProgrammingLanguageTechnologiesResponse>();
		
		for (ProgrammingLanguageTechnology programmingLanguageTechnology : programmingLanguageTechnologies) {
			GetAllProgrammingLanguageTechnologiesResponse responseItem = new GetAllProgrammingLanguageTechnologiesResponse();
			responseItem.setId(programmingLanguageTechnology.getId());
			responseItem.setName(programmingLanguageTechnology.getName());
			responseItem.setProgrammingLanguageName(programmingLanguageTechnology.getProgrammingLanguage().getName());
			programmingLanguageTechnologiesResponse.add(responseItem);
		}
		
		return programmingLanguageTechnologiesResponse;
	}

	@Override
	public GetByIdProgrammingLanguageTechnologyResponse getById(int id) {
		ProgrammingLanguageTechnology programmingLanguageTechnology = programmingLanguageTechnologyRepository.getReferenceById(id);
		
		GetByIdProgrammingLanguageTechnologyResponse responseItem = new GetByIdProgrammingLanguageTechnologyResponse();
		responseItem.setId(programmingLanguageTechnology.getId());
		responseItem.setName(programmingLanguageTechnology.getName());
		responseItem.setProgrammingLanguageName(programmingLanguageTechnology.getProgrammingLanguage().getName());
		
		return responseItem;
	}

	@Override
	public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getReferenceById(createProgrammingLanguageTechnologyRequest.getProgrammingLanguageId());
		
		programmingLanguageTechnology.setName(createProgrammingLanguageTechnologyRequest.getName());
		programmingLanguageTechnology.setProgrammingLanguage(programmingLanguage);
		
		programmingLanguageTechnologyRepository.save(programmingLanguageTechnology);
	}

	@Override
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		int updatingId = updateProgrammingLanguageTechnologyRequest.getId();
		ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();
		programmingLanguageTechnology = programmingLanguageTechnologyRepository.getReferenceById(updatingId);
		programmingLanguageTechnology.setName(updateProgrammingLanguageTechnologyRequest.getName());
		programmingLanguageTechnologyRepository.save(programmingLanguageTechnology);
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageTechnologyRepository.deleteById(id);
		
	}
	
	
	
	
}
