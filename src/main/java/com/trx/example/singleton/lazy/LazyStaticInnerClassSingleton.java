package com.trx.example.singleton.lazy;

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){

        if(LazyHolder.instance!=null){

            throw new RuntimeException("������Ƿ�����");
        }
    }

    private  static LazyStaticInnerClassSingleton  getInstance(){


        return LazyHolder.instance;
    }
    private static class LazyHolder {


        private static final LazyStaticInnerClassSingleton instance = new LazyStaticInnerClassSingleton();
    }
}
