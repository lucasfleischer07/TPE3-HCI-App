package com.example.smartclick_app.Model;

import java.util.ArrayList;

public class Room {
    private final int id;
    private ArrayList<Device> devices;
    private String name;

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
