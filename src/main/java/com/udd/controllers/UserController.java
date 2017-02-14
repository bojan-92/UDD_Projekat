package com.udd.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.udd.entities.User;
import com.udd.enumerations.Role;
import com.udd.services.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/hello")
	public String welcome(Model model,
			@RequestParam(value = "hello", required = false, defaultValue = "hello") String hello) {
		model.addAttribute("hello", hello);
		return "hello";
	}

	@RequestMapping("user/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		List<String> roles = new ArrayList<>();
		roles.add(Role.ADMINISTRATOR.toString());
		roles.add(Role.SUBSCRIBER.toString());
		roles.add(Role.VISITOR.toString());
		model.addAttribute("roles", roles);
		return "userAdd";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("users", userService.listAllUsers());
		System.out.println("Returning users:");
		return "users";
	}

	@RequestMapping("user/{id}")
	public String showUser(@PathVariable Integer id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "userShow";
	}

	@RequestMapping("user/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "userEdit";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String saveUser(User user, @RequestParam(value = "role", required = false) String role) {
		user.setType(role);
		userService.saveUser(user);
		return "redirect:/user/" + user.getId();
	}

	@RequestMapping(value = "/user/update/{id}", method = RequestMethod.POST)
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
	}
}
