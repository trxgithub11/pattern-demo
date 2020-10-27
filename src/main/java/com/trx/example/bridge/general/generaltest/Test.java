package com.trx.example.bridge.general.generaltest;

public class Test {

    public static void main(String[] args) {
        Implementor implementor = new ConcreteImpA();
        Abstraction abstraction = new RefinedAbstaction(implementor);
        abstraction.add();
    }
}
