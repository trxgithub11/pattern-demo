package com.trx.example.builder.chain;

public class Test {

    public static void main(String args[]){

        CourseBuilder  builder  = new CourseBuilder()
                .addName("���ģʽ")
                .addPpt("ppt�μ�")
                .addNote("���ñʼ�")
                .addVide("�ط���Ƶ").addHomework("�κ���ҵ");

        System.out.println(builder.build());
    }
}
