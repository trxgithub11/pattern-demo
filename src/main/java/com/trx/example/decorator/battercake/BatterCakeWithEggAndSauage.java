package com.trx.example.decorator.battercake;

public class BatterCakeWithEggAndSauage extends BatterCakeWithEgg{

    public String getMsg(){

        return super.getMsg()+"œ„≥¶";
    }

    public int getPrice(){

        return super.getPrice()+2;
    }
}
