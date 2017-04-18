package jp.ne.naokiur.design.pattern.iterator;

public class EmployeeAsendingIterator implements Iterator {
    private EmployeeMember employeeMember;
    private int index;

    public EmployeeAsendingIterator(EmployeeMember employeeMember) {
        this.employeeMember = employeeMember;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (employeeMember.getEmployees().size() <= index) {
            return false;
        }

        return true;
    }

    @Override
    public Employee next() {
        Employee employee = employeeMember.getEmployees().get(index);
        index++;

        return employee;
    }

    @Override
    public boolean isMatchedAge(Integer age) {
        Employee employee = employeeMember.getEmployees().get(index);

        return employee.getAge().equals(age);
    }

    @Override
    public Employee current() {
        return employeeMember.getEmployees().get(index);

    }
}
