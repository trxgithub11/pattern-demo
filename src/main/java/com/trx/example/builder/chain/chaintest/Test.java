package com.trx.example.builder.chain.chaintest;

public class Test {


    public  static void  main(String [] args) {
        CourseBuilder courseBuilder = new CourseBuilder()
                .addName("�γ�����")
                .addNote("�γ̱ʼ�")
                .addPpt("�γ�ppt");

        System.out.println(courseBuilder.builder());

    }
}
