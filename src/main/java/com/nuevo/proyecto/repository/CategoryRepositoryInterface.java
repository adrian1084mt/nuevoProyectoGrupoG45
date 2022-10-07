package com.nuevo.proyecto.repository;

import com.nuevo.proyecto.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositoryInterface extends CrudRepository<Category, Integer> {

}
