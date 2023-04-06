package com.example.inventoryservice.service;

import com.example.inventoryservice.repository.Item;
import com.example.inventoryservice.repository.ItemRepository;
import com.example.inventoryservice.service.model.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final ItemRepository itemRepository;

    @Override
    public ItemDto getItemByName(String identifier) {
        Item item = itemRepository.findByItemName(identifier).orElseThrow(NoSuchElementException::new);

        ItemDto itemDto = ItemDto.builder().build();

        BeanUtils.copyProperties(item, itemDto);

        return itemDto;

    }
}
