package com.trx.example.visitor.kpi;

public interface IVisitor {

    void visit(Engineer engineer);
    void visit(Manager manager);
}
