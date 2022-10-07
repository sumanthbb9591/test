package com.testing.entity;

import javax.persistence.Entity;

	@Entity
	 public class Order {
		private long id;
		private long orderDate;
		private boolean orderStatus;
		private String collectionOfItems;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public long getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(long orderDate) {
			this.orderDate = orderDate;
		}
		public boolean isOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(boolean orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getCollectionOfItems() {
			return collectionOfItems;
		}
		public void setCollectionOfItems(String collectionOfItems) {
			this.collectionOfItems = collectionOfItems;
		}

	}


