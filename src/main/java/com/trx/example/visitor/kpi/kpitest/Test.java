package com.trx.example.visitor.kpi.kpitest;

public class Test {

    public static void main(String[] args) {
        BusinessReport  report = new BusinessReport();
        report.showReport(new CEOVisitor());

    }
}
