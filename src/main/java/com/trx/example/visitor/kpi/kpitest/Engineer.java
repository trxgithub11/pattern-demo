package com.trx.example.visitor.kpi.kpitest;

import java.util.Random;

public class Engineer  extends Employee{


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engineer(String name) {
        super(name);
        this.name = name;
    }

    public void accept(IVisitor visitor) {

        visitor.visit(this);
    }

    public int get(){

        return new Random().nextInt(10);
    }
}
