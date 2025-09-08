package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    // when introduce a person of student then return message with name and age
    @Test
    public void should_return_message_with_name_and_age_with_introduce_a_person_of_student() {
        Person student = new Student(1, "Tom", 18);
        String introduce = student.introduce();
        assertEquals("My name is Tom. I am 18 years old. I am a student.", introduce);
    }

    // when introduce a person of teacher then return message with name and age
    @Test
    public void should_return_message_with_name_and_age_with_introduce_a_person_of_teacher() {
        Person teacher = new Teacher(1, "Jerry", 21);
        String introduce = teacher.introduce();
        assertEquals("My name is Jerry. I am 21 years old. I am a teacher.", introduce);
    }
}
