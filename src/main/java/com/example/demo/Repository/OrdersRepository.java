package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

	List<Orders> findBypName(String name);
	List<Orders> findByphoneNumber(String phoneNumber);
	List<Orders> findByemailId(String email);
}
