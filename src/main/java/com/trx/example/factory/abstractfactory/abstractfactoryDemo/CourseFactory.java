package com.trx.example.factory.abstractfactory.abstractfactoryDemo;

public abstract  class CourseFactory {

    public void init(){

        System.out.println("���ݳ�ʼ��");
    }

    public abstract  INote createNote();
    public abstract  IVideo createVideo();
}
