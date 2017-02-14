package com.udd.services;

import com.udd.entities.Language;

public interface LanguageService {

	Iterable<Language> listAllLanguages();

	Language getLanguageById(Integer id);

	Language saveLanguage(Language language);

	void deleteLanguage(Integer id);
}
