package com.michalkrawczak.workshop.rest.model;

import java.util.Date;

/**
 * User: lahim
 * Date: 3/18/13
 */
public class SimpleModel {

    private String message;
    private String value;
    private Date date;

    public SimpleModel() {
    }

    public SimpleModel(String message) {
        this.message = message;
        this.date = new Date();
    }

    public SimpleModel(String message, String value) {
        this.message = message;
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
