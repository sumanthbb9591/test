package com.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testing.entity.Order;
import com.testing.repository.OrderRepository;

@Controller
public class OrderController {
	
	@Autowired
	private OrderRepository orepo;
	
	@RequestMapping("/order")
	public String OrderPage() {
		return"order_page";
	
}




      @RequestMapping("/order")
      public String saveOneOrder(@ModelAttribute("order") Order order) {
        orepo.save(order);
          return "item_page";

      }
	
	
	
	
}
