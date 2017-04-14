package jp.ne.naokiur.design.pattern.iterator;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // These codes is wrong pattern according to OOP begin.
        // I think that the top of reason is if we need to modify the method,
        // we need to modify App class despite we should modify List<Employee>.
        List<Employee> employees = Arrays.asList(new Employee("john", "John", "Smith", 24), new Employee("jane", "Jane", "Smith", 22));

        // This is assumption of Requirement that We need to search first of target age employee.
        Employee matchedEmployee = searchTargetAgeEmployee(employees, 22);

        System.out.println(matchedEmployee.getFirstName() + " " + matchedEmployee.getLastName());
        // These codes is wrong pattern according to OOP end.
    }

    /**
     * This is wrong method because App class should not have this responsibility.
     * List<Employee> should have this responsibility.
     *
     * @param employees
     * @param targetAge
     * @return
     */
    private static Employee searchTargetAgeEmployee(List<Employee> employees, int targetAge) {
        for (Employee employee : employees) {
            if (employee.getAge() == targetAge) {
                return employee;
            }
        }

        return new Employee("", "", "", 0);
    }
}
