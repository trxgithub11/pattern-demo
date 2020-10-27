package com.trx.example.composite.general.safe;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    public String operation() {
        return this.name;
    }
}
