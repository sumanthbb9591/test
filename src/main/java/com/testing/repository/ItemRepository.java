package com.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
