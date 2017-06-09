package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 * Created by kushan_chinthaka on 6/4/2017.
 */
public class Van {
    private int Id;

    private String model;

    @Autowired
    private MessageSource messageSource;

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

    public void drive() {
        System.out.println(messageSource.getMessage("message2", null,"def", null));
    }
    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
