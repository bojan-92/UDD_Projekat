package com.udd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udd.entities.Language;
import com.udd.repositories.LanguageRepository;

@Service
public class LanguageServiceImpl implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public void setLanguageRepository(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public Iterable<Language> listAllLanguages() {
		return languageRepository.findAll();
	}

	@Override
	public Language getLanguageById(Integer id) {
		return languageRepository.findOne(id);
	}

	@Override
	public Language saveLanguage(Language language) {
		return languageRepository.save(language);
	}

	@Override
	public void deleteLanguage(Integer id) {
		languageRepository.delete(id);
	}

}
