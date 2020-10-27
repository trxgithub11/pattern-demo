package com.trx.example.visitor.kpi;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    private List<Employee> employees = new LinkedList<Employee>();

    public BusinessReport() {
        employees.add(new Manager("��Ʒ����A"));
        employees.add(new Engineer("����ԱA"));
        employees.add(new Engineer("����ԱB"));
        employees.add(new Engineer("����ԱC"));
        employees.add(new Manager("��Ʒ����B"));
        employees.add(new Engineer("����ԱD"));
    }

    public void showReport(IVisitor visitor) {

        for (Employee employee : employees) {

            employee.accept(visitor);
        }
    }
}
