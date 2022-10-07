package com.testing.entity;

import javax.persistence.Entity;

@Entity
public class Item {
	 
		private long id;
		private String itemName;
		private int itemUnitPrice;
		private int itemQuantity;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getItemUnitPrice() {
			return itemUnitPrice;
		}
		public void setItemUnitPrice(int itemUnitPrice) {
			this.itemUnitPrice = itemUnitPrice;
		}
		public int getItemQuantity() {
			return itemQuantity;
		}
		public void setItemQuantity(int itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

	}


