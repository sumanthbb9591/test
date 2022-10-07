package com.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.testing.entity.Item;
import com.testing.entity.Order;
import com.testing.repository.ItemRepository;
import com.testing.repository.OrderRepository;

@SpringBootTest
class TestingApplicationTests {
	@Autowired
	private OrderRepository orepo;
	@Autowired
	private ItemRepository irepo;

	@Test
	void saveOneOrder() {
		Order o = new Order();
		o.setId(1);
		o.setOrderDate(2022-10-06);
		o.setOrderStatus(true);
		o.setCollectionOfItems(null);
		orepo.save(o);
	}
	@Test
	void saveOneItem() {
		Item i = new Item();
		 i.setId(1);
		 i.setItemName("tv");
		 i.setItemQuantity(2);
		 i.setItemUnitPrice(2);
		irepo.save(i);
		
}
}
