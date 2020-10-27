package com.trx.example.strategy.general;

public class Test {

    public static void main(String[] args) {
        IStrategy  strategy = new ConcreteStrategyA();
        new Context(strategy).get();
    }
}
