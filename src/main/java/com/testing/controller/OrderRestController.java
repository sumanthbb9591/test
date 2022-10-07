package com.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.entity.Order;
import com.testing.repository.OrderRepository;

@RestController
@RequestMapping("/order/api")
public class OrderRestController {
	 
		@Autowired
		private OrderRepository orepo;
		
		@GetMapping
	    public List<Order> getallOrders(){
		List<Order> orders = orepo.getOrders();
		return orders;
	}
		@PostMapping 
		public void saveOrder(@RequestBody Order order) {
			orepo.saveOrder(order);
			
		}
		@PutMapping
		public void updateOrder (@RequestBody Order order) {
			orepo.saveOrder(order);
		}
		@DeleteMapping("/delete/{id}")
		public void deletOrder(@PathVariable("id")Long id) {
			orepo.deletebyid(id);
		}
		@RequestMapping("/get/{id}")
		public Order getOrder(@PathVariable("id")Long id) {
			try {
				 Order order =orepo.findOrderbyid(id);
				return order;
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
			
		}



