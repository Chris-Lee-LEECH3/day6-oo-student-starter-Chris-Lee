package oo.step2;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    public void should_return_message_with_name_and_age_with_introduce_a_student() {
        Person student = new Student(1, "Tom", 18);
        String introduce = student.introduce();
        assertEquals("My name is Tom. I am 18 years old. I am a student.", introduce);
    }

    // when equals two same id student then return true
    @Test
    public void should_return_true_when_equals_two_same_id_student() {
        Student student1 = new Student(1, "Tom", 18);
        Student student2 = new Student(1, "Tom", 18);
        assertEquals(student1, student2);
    }

    // when equals two different id student then return false
    @Test
    public void should_return_false_when_equals_two_different_id_student() {
        Student student1 = new Student(1, "Tom", 18);
        Student student2 = new Student(2, "Tom", 18);
        assertNotEquals(student1, student2);
    }
}
