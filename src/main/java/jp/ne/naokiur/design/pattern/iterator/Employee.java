package jp.ne.naokiur.design.pattern.iterator;

public class Employee {
    private final String userId;
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public Employee(String userId, String firstName, String lastName, Integer age) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
