package com.trx.example.composite.general.safe;

public class Test {

    public static void main(String[] args) {
        // 来一个根节点
        Composite root = new Composite("root");
        // 来一个树枝节点
        Composite branchA = new Composite("---branchA");
        Composite branchB = new Composite("------branchB");
        // 来一个叶子节点
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
