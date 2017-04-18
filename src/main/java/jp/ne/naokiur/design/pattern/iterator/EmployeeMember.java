package jp.ne.naokiur.design.pattern.iterator;

import java.util.List;

public class EmployeeMember implements Aggregate {
    private List<Employee> employees;

    public EmployeeMember(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator iterator() {
        return new EmployeeAscendingIterator(this);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
