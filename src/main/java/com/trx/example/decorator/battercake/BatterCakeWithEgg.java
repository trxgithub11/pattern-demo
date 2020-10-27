package com.trx.example.decorator.battercake;

public class BatterCakeWithEgg extends  BatterCake{


    public String getMsg(){

        return super.getMsg()+"¼¦µ°";
    }

    public int getPrice(){

        return super.getPrice()+1;
    }
}
