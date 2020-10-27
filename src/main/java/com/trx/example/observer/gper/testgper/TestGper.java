package com.trx.example.observer.gper.testgper;

import com.gupao.example.general.Test;
import com.gupao.example.general.Test;

public class TestGper {

    public static void main(String args[]){

        Teacher tom = new Teacher("tom");
        Teacher  jerry = new Teacher("jerry");

        Gper  gper = new Gper("gper生态圈");

        gper.addObserver(tom);
        gper.addObserver(jerry);

        Question  question  = new Question();

        question.setUserName("trxtest");
        question.setContent("提一个问题");

        gper.publish(question);
    }
}
