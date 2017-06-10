package com.examples.collections;

import java.util.List;
import java.util.Map;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ShoppingCart {
    private List<String> items;

    private Map<String, Integer> quantity;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(Map<String, Integer> quantity) {
        this.quantity = quantity;
    }
}
