package com.trx.example.singleton.hungry;

public class TestStatic {

    private static String ss ="11";
    private static  final  TestStatic  testStatic;
    static{
        testStatic = new TestStatic();
        System.out.println("��̬��");
        System.out.println(ss);



    }

    private TestStatic(){

        System.out.println("���췽����ʼ��");
    }

    public static void main(String args[]){

        System.out.println("main");
        new TestStatic();
    }
}
