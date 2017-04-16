package jp.ne.naokiur.design.pattern.iterator;

public class EmployeeIterator implements Iterator {
    private EmployeeMember employeeMember;
    private int index;

    public EmployeeIterator(EmployeeMember employeeMember) {
        this.employeeMember = employeeMember;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (employeeMember.getEmployees().size() < index) {
            return true;
        }

        return false;
    }

    @Override
    public Employee next() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }


}
