package com.trx.example.prototype.singleton;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args[]){

        ConcreatePrototype  prototype = ConcreatePrototype.getInstance();
        prototype.setAge(18);
        prototype.setName("tom");
        List<String> hobies = new ArrayList<String>();
        hobies.add("�鷨");
        hobies.add("����");
        prototype.setHobbies(hobies);

        ConcreatePrototype cloneType = prototype.clone();

        cloneType.getHobbies().add("������");



        System.out.println("ԭ�Ͷ���" + prototype);
        System.out.println("��¡����" + cloneType);
        System.out.println(prototype == cloneType);


        System.out.println("ԭ�Ͷ���İ��ã�" + prototype.getHobbies());
        System.out.println("��¡����İ��ã�" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());





































    }
}
