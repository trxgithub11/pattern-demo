package com.trx.example.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println(object);
        after();
        return object;
    }

    private void before() {
        System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ�ȷ���������");
        System.out.println("��ʼ��ɫ");
    }

    private void after() {
        System.out.println("OK�Ļ���׼������");
    }
}
