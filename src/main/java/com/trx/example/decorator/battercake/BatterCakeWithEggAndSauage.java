package com.trx.example.decorator.battercake;

public class BatterCakeWithEggAndSauage extends BatterCakeWithEgg{

    public String getMsg(){

        return super.getMsg()+"�㳦";
    }

    public int getPrice(){

        return super.getPrice()+2;
    }
}
