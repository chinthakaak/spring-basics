package com.examples;

import java.util.List;
import java.util.Map;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class Vehicle {
    private String color;

    private List<String> details;

    private Map<String, String> systems;

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public Map<String, String> getSystems() {
        return systems;
    }

    public void setSystems(Map<String, String> systems) {
        this.systems = systems;
    }
}
