package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entitites.Category;
import com.educandoweb.courseSpring.entitites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
