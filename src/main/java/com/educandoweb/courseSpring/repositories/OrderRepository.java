package com.educandoweb.courseSpring.repositories;

import com.educandoweb.courseSpring.entitites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
