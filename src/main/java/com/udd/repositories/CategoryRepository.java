package com.udd.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udd.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
