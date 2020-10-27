package com.trx.example.factory.factorymethod;

public class JavaCourseFactory implements ICourseFactory{


    public ICourse create() {
        return new JavaCourse();
    }
}
