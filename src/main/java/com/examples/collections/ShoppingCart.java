package com.examples.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class ShoppingCart {
    private List<String> items;

    private Set<String> gifts;

    private Map<String, Integer> quantities;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<String, Integer> quantities) {
        this.quantities = quantities;
    }

    public Set<String> getGifts() {
        return gifts;
    }

    public void setGifts(Set<String> gifts) {
        this.gifts = gifts;
    }
}
