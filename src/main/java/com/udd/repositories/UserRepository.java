package com.udd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udd.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
