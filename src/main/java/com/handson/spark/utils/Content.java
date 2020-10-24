package com.handson.spark.utils;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2020 TD
 *
 * <p> Description:
 *
 * @author liufeng
 * @date 2020/10/23 18:21
 * @since
 */
public class Content implements Serializable {
    private static final long serialVersionUID = 2750954386914835184L;

    private String id;
    String user;
    String text;
    String place;
    String country;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", place='" + place + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
