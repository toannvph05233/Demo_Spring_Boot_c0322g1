package com.example.demo_boot.repository;

import com.example.demo_boot.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category, Long> {
}
