package com.classexercisedwo.demo.springclass.repositories;

import com.classexercisedwo.demo.springclass.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
