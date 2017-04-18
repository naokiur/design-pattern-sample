package jp.ne.naokiur.design.pattern.iterator;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // These codes is wrong pattern according to OOP begin.
        // I think that the top of reason is if we need to modify the method,
        // we need to modify App class despite we would not like to modify App class.
        List<Employee> employees = Arrays.asList(new Employee("john", "John", "Smith", 24), new Employee("jane", "Jane", "Smith", 22), new Employee("bob", "Bob", "Smith", 22));

        // This is assumption of Requirement that We need to search first of target age employee.
        Employee firstMatchedEmployee = searchTargetAgeEmployeeFirstly(employees, 22);

        // This is assumption of Requirement that We need to search last of target age employee.
        Employee lastMatchedEmployee = searchTargetAgeEmployeeLast(employees, 22);

        System.out.println("Wrong pattern of First:" + firstMatchedEmployee.getFirstName());
        System.out.println("Wrong pattern of Last:" + lastMatchedEmployee.getFirstName());
        // These codes is wrong pattern according to OOP end.

        // Try to Iterator pattern begin.
        EmployeeMember employeeMember = new EmployeeMember(Arrays.asList(new Employee("john", "John", "Smith", 24), new Employee("jane", "Jane", "Smith", 22), new Employee("bob", "Bob", "Smith", 22)));
        Iterator iterator = employeeMember.iterator();
        while (!iterator.isMatchedAge(22)) {
            iterator.next();
        }
        Employee matchedEmployee = iterator.current();
        System.out.println("Correct pattern of first:" + matchedEmployee.getFirstName());
//        System.out.println("Correct pattern of last:" + matchedEmployee.getFirstName());


        // Try to Iterator pattern end.
    }

    /**
     * This is wrong method because App class should not have this responsibility.
     * Reason of needing to create this method is Wrong class design.
     *
     * @param employees
     * @param targetAge
     * @return
     */
    private static Employee searchTargetAgeEmployeeFirstly(List<Employee> employees, int targetAge) {
        for (Employee employee : employees) {
            if (employee.getAge() == targetAge) {
                return employee;
            }
        }

        return new Employee("", "", "", 0);
    }

    /**
     * This is wrong method because App class should not have this responsibility.
     * Reason of needing to create this method is Wrong class design.
     *
     * @param employees
     * @param targetAge
     * @return Matched last employee. There is possibility of <null>.
     */
    private static Employee searchTargetAgeEmployeeLast(List<Employee> employees, int targetAge) {
        Employee lastEmployee = null;
        for (Employee employee : employees) {
            if (employee.getAge() == targetAge) {
                lastEmployee = employee;
            }
        }

        return lastEmployee;
    }
}
