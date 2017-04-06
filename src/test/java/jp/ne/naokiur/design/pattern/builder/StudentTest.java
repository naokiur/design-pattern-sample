package jp.ne.naokiur.design.pattern.builder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StudentTest {

    @Test
    public void createJohn() {
        Student john = new Student.StudentBuilder().withName("john").withAge(22).withAddress("America").build();

        assertThat(john.introduce(), is("john : 22 : America"));
    }
}
