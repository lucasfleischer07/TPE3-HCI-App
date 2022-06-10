package com.example.smartclick_app.Model;

import java.util.ArrayList;

public class House {
    private final int id;
    private ArrayList<Room> rooms;
    private String name;

    public House(int id, String name) {
        this.id = id;
        this.name = name;
        rooms=new ArrayList<Room>();
    }
}
