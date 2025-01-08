package com.deep.Inventory.Management.System.service;

import com.deep.Inventory.Management.System.model.Item;
import com.deep.Inventory.Management.System.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item getItemById(int id){
        return itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item Not Found"));
    }
}