package com.examples;

import java.util.List;
import java.util.Map;

/**
 * Created by kushan_chinthaka on 6/10/2017.
 */
public class Bus extends Vehicle {
    private int length;

    private List<String> details;

    private Map<String, String> systems;

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    @Override
    public Map<String, String> getSystems() {
        return systems;
    }

    @Override
    public void setSystems(Map<String, String> systems) {
        this.systems = systems;
    }
}
