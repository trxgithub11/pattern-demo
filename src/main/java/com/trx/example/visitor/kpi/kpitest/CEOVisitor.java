package com.trx.example.visitor.kpi.kpitest;

public class CEOVisitor implements  IVisitor{
    public void visit(Engineer engineer) {
        System.out.println("����engineer kpi��Ϣ"+engineer.get()+"������"+engineer.getName());
    }

    public void visit(Manager manager) {

        System.out.println("����manager kpi��Ϣ"+manager.get()+"������"+manager.getName());
    }
}
