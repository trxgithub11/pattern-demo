package com.trx.example.visitor.kpi.kpitest;

public interface IVisitor {

    void visit(Engineer engineer);
    void visit(Manager manager);

}
