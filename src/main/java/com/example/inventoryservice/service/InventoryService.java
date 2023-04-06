package com.example.inventoryservice.service;

import com.example.inventoryservice.service.model.ItemDto;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface InventoryService {

    /**
     * Gets required item if available.
     *
     * @return Required item.
     */
    ItemDto getItemByName(String identifier);

}
