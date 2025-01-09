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

    public Item addQuantity(int itemId, int quantityToAdd){
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item Not Found"));
        item.setQuantity(item.getQuantity() + quantityToAdd);
        itemRepository.save(item);
        return item;
    }

    public Item reduceQuantity(int itemId, int quantityToReduce){
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item Not Found"));
        if(item.getQuantity() - quantityToReduce < 0){
            throw new RuntimeException("Quantity to Reduce cannot be greater than current Quantity");
        }
        item.setQuantity(item.getQuantity() - quantityToReduce);
        itemRepository.save(item);
        return item;
    }

    public void deleteItemById(int itemId){
        itemRepository.deleteById(itemId);
    }

    public Item updatePrice(int price, int itemId) {
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item Not Found"));
        if(price <= 0){
            throw new RuntimeException("Price cannot be less than or equal to 0");
        }
        item.setPrice(price);
        itemRepository.save(item);
        return item;
    }
}