package jp.ne.naokiur.design.pattern.builder;

public final class Student {
    private final String name;
    private final Integer age;
    private final String address;

    private Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class StudentBuilder {
        private String name;
        private Integer age;
        private String address;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public StudentBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(name, age, address);
        }
    }

    public String introduce() {
        return name + " : " + age + " : " + address;
    }
}
