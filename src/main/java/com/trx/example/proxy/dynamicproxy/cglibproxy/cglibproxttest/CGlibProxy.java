package com.trx.example.proxy.dynamicproxy.cglibproxy.cglibproxttest;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProxy implements MethodInterceptor {



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {




        before();
        methodProxy.invokeSuper(o,objects);
        after();

        return null;
    }


    private void before() {
        System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ�ȷ���������");
        System.out.println("��ʼ��ɫ");
    }

    private void after() {
        System.out.println("OK�Ļ���׼������");
    }
}
