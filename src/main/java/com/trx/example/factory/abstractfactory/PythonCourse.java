package com.trx.example.factory.abstractfactory;

import com.trx.example.factory.factorymethod.ICourse;

public class PythonCourse implements ICourse {
    public void record() {
        System.out.println("录制Python课程");
    }
}
