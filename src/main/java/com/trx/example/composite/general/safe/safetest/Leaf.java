package com.trx.example.composite.general.safe.safetest;

public class Leaf extends Component{

    private String name;
    public Leaf(String name) {
        super(name);
        this.name = name;
    }

    public String operation() {
        return this.name;
    }
}
