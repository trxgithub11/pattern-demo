package com.trx.example.composite.general.safe;

public class Test {

    public static void main(String[] args) {
        // ��һ�����ڵ�
        Composite root = new Composite("root");
        // ��һ����֦�ڵ�
        Composite branchA = new Composite("---branchA");
        Composite branchB = new Composite("------branchB");
        // ��һ��Ҷ�ӽڵ�
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);
        branchB.addChild(leafA);
        String result = root.operation();
        System.out.println(result);

    }
}
