package com.examples;

import java.util.List;
import java.util.Map;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class Car {
    private int Id;

    private String model;

    private List<String> drivers;

    private Map<String, String> weight;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<String> drivers) {
        this.drivers = drivers;
    }

    public Map<String, String> getWeight() {
        return weight;
    }

    public void setWeight(Map<String, String> weight) {
        this.weight = weight;
    }
}
