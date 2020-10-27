package com.trx.example.visitor.kpi;

public class CEOVisitor implements IVisitor {
    public void visit(Engineer engineer) {

        System.out.println("����ʦ" +  engineer.name + "��KIP��" + engineer.kpi);
    }

    public void visit(Manager manager) {
        System.out.println("����" +  manager.name + ",KPI:" + manager.kpi + "����Ʒ������" + manager.getProducts());
    }
}
