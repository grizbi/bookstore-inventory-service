package com.example.inventoryservice.service;

import com.example.inventoryservice.service.model.ItemDto;

public interface InventoryService {

    /**
     * Gets required item if available.
     *
     * @return Required item.
     */
    ItemDto getItemByName(String identifier);

}
