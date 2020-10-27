package com.trx.example.factory.factorymethod;

public class PythonCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}
