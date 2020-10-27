package com.trx.example.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeiPo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {

        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        before();
        Object result = method.invoke(this.target, args);
        after();

        return result;
    }


    private void after() {
        System.out.println("˫��ͬ�⣬��ʼ����");
    }

    private void before() {
        System.out.println("����ý�ţ��Ѿ��ռ���������󣬿�ʼ��ɫ");
    }
}
