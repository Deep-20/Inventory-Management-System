package com.deep.Inventory.Management.System.controller;

import com.deep.Inventory.Management.System.model.Item;
import com.deep.Inventory.Management.System.repository.ItemRepository;
import com.deep.Inventory.Management.System.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAll(){
        return itemService.getAllItems();
    }

    @GetMapping("/{itemId}")
    public Item getItemById(@PathVariable int itemId){
        return itemService.getItemById(itemId);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

}
