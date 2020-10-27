package com.trx.example.Adapter.general.classadapter;

public class Adapter extends Adaptee implements Target{
    public int request() {
        return super.get()/10;
    }
}
