package com.trx.example.decorator.battercake;

public class Test {


    public static void main(String args[]){

        BatterCake battercake = new BatterCake();
        System.out.println(battercake.getMsg() + ",�ܼۣ�" + battercake.getPrice());

        BatterCakeWithEgg battercakeWithEgg = new BatterCakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",�ܼۣ�" + battercakeWithEgg.getPrice());

        BatterCakeWithEggAndSauage battercakeWithEggAndSauage = new BatterCakeWithEggAndSauage();
        System.out.println(battercakeWithEggAndSauage.getMsg() + ",�ܼۣ�" + battercakeWithEggAndSauage.getPrice());
    }

}
