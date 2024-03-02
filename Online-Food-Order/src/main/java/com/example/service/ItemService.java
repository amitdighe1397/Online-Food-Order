package com.example.service;

import java.util.List;

import com.example.payloads.ItemPayload;

public interface ItemService {
    List<ItemPayload> getAllItems();
    ItemPayload getItemById(int itemId);
    ItemPayload createItem(ItemPayload itemPayload);
    void deleteItem(int itemId);
}

