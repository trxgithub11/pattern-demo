package com.trx.example.factory.factorymethod.factorymethoddemo;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
