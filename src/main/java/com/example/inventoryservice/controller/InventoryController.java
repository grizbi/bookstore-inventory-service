package com.example.inventoryservice.controller;


import com.example.inventoryservice.service.InventoryService;
import com.example.inventoryservice.service.model.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping("/items/{identifier}")
    ResponseEntity<ItemDto> getItem(@PathVariable String identifier) {
        return ResponseEntity.ok(inventoryService.getItemByName(identifier));
    }

}
