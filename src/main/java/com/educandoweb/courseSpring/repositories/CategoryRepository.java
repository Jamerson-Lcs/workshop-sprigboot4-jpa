package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entitites.Category;
import com.educandoweb.courseSpring.entitites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
