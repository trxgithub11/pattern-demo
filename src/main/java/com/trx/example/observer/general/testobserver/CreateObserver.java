package com.trx.example.observer.general.testobserver;

public class CreateObserver implements IObserver{
    @Override
    public void update(String event) {
        System.out.println("receive event:"+event);
    }
}
