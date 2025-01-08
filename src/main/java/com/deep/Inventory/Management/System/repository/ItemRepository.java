package com.deep.Inventory.Management.System.repository;

import com.deep.Inventory.Management.System.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
