package oo.step3;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // when student not join klass and isIn klass then return false
    @Test
    public void should_return_false_when_student_not_join_klass_and_isIn_klass() {
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
//        student.join(klass);
        assertFalse(student.isIn(klass));
    }

    // when student join klass and isIn klass then return true
    public void should_return_true_when_student_join_klass_and_isIn_klass() {
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        student.join(klass);
        assertTrue(student.isIn(klass));
    }

    // when student join two klass then return recently klass
    public void should_return_recently_klass_when_student_join_two_klass() {
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);
        student.join(klass);
        student.join(klass2);
        assertTrue(student.isIn(klass2));
    }

    // when introduce a student is in a class then return message with name age and class
    public void should_return_message_with_name_and_age_and_class_when_introduce_a_student_is_in_a_klass() {
        Student student = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        student.join(klass);
        String introduce = student.introduce();
        assertEquals("My name is Tom. I am 18 years old. I am a student. I am in class 1.", introduce);
    }

}
