package com.udd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.udd.entities.Language;
import com.udd.services.LanguageService;

@Controller
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public void setLanguageService(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("language/new")
	public String newLanguage(Model model) {
		model.addAttribute("language", new Language());
		return "languageAdd";
	}

	@RequestMapping(value = "/languages", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("languages", languageService.listAllLanguages());
		System.out.println("Returning languages:");
		return "languages";
	}

	@RequestMapping("language/{id}")
	public String showLanguage(@PathVariable Integer id, Model model) {
		model.addAttribute("language", languageService.getLanguageById(id));
		return "languageShow";
	}

	@RequestMapping("language/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("language", languageService.getLanguageById(id));
		return "languageEdit";
	}

	@RequestMapping(value = "/language", method = RequestMethod.POST)
	public String saveLanguage(Language language) {
		languageService.saveLanguage(language);
		return "redirect:/language/" + language.getId();
	}

	/*@RequestMapping(value = "/user/update/{id}", method = RequestMethod.POST)
	public String updateUser(@PathVariable Integer id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword) {
		User user = userService.getUserById(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		userService.saveUser(user);
		return "redirect:/user/" + user.getId();
	}

	@RequestMapping("user/delete/{id}")
	public String delete(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "redirect:/users";
	}*/
}
