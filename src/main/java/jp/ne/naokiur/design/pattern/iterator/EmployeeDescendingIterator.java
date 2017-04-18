package jp.ne.naokiur.design.pattern.iterator;

public class EmployeeDescendingIterator implements Iterator {
    private EmployeeMember employeeMember;
    private int index;

    public EmployeeDescendingIterator(EmployeeMember employeeMember) {
        this.employeeMember = employeeMember;
        this.index = this.employeeMember.getEmployees().size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (0 > index) {
            return false;
        }

        return true;
    }

    @Override
    public Employee next() {
        Employee employee = employeeMember.getEmployees().get(index);
        index--;

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
