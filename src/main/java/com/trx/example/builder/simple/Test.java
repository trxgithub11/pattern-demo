package com.trx.example.builder.simple;

public class Test {

    public static void main(String[] args){

        CourseBuilder courseBuilder = new CourseBuilder();
        courseBuilder.addName("�γ�����");
        courseBuilder.addPpt("�γ�ppt");
        courseBuilder.addNote("�γ̱ʼ�");
        courseBuilder.addVideo("�γ̻ط�");
        courseBuilder.addHomework("�κ���ҵ");
        Course  course = courseBuilder.builer();
        System.out.println(course);
    }
}
