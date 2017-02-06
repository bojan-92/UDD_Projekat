package com.udd.services;

import com.udd.entities.User;

public interface UserService {

	Iterable<User> listAllUsers();

	User getUserById(Integer id);

	User saveUser(User product);

	void deleteUser(Integer id);

}
