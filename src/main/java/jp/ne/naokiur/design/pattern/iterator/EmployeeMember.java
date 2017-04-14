package jp.ne.naokiur.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMember {
    private List<Employee> employees;

    public EmployeeMember() {
        this.employees = new ArrayList<>();
    }
}
