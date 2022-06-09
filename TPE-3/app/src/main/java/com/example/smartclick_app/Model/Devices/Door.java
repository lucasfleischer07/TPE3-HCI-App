package com.example.smartclick_app.Model.Devices;

import com.example.smartclick_app.Model.Device;

public class Door extends Device {
    private String status;
    private String lock;
    public void close(){
        this.status="closed";
    }
    public void open(){
        if(this.lock!="locked")
        this.status="opened";
    }
    public void lock(){
        if(this.status!="opened")
        this.lock="locked";
    }
    public void unlock(){
        this.lock="unlocked";
    }
    public Door(int id,String name){

    }
}
