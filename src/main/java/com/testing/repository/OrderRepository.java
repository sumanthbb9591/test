package com.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> getOrders();

	void saveOrder(Order order);

	void deletebyid(Long id);

	Order findOrderbyid(Long id);
 

}
