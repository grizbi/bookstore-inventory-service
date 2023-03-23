package com.example.inventoryservice.service.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ItemDto {
    private String itemName;
    private int price;
}
