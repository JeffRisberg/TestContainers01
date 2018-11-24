package com.company.services;

import org.apache.commons.lang3.StringUtils;

/*
import com.codecentric.sample.store.model.Item;
import com.codecentric.sample.store.repository.ItemRepository;
import com.codecentric.sample.store.service.tools.StaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
*/

import com.company.models.Item;
import com.company.stores.ItemStore;

import java.io.IOException;
import java.util.List;

//@Service
public class ItemService {

  private ItemStore userStore = new ItemStore();

  public int getAveragePrice() {

    List<Item> items = userStore.readAllItems();

    int sumOfPrices = 0;
    for (Item item : items) {
      sumOfPrices += item.getPrice();
    }

    return (sumOfPrices / items.size());
  }

  public String getItemNameUpperCase(long itemId) {

    Item item = userStore.findById(itemId);

    return StringUtils.upperCase(item.getName());
  }


}
