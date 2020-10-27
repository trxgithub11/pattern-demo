package com.trx.example.composite.general.safe.safetest;

public abstract  class Component {

    private String name;
    public Component(String name) {

        this.name = name;
    }

    public  abstract  String operation();


}
