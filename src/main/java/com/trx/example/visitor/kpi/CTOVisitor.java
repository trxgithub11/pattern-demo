package com.trx.example.visitor.kpi;

public class CTOVisitor implements IVisitor {
    public void visit(Engineer engineer) {

        System.out.println("����ʦ" +  engineer.name + "������������" + engineer.getCodeLines());
    }

    public void visit(Manager manager) {
        System.out.println("����" +  manager.name + "����Ʒ������" + manager.getProducts());
    }
}
