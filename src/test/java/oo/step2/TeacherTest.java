package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    public void should_return_message_with_name_and_age_with_introduce_a_teacher() {
        Teacher teacher = new Teacher(1, "Tom", 18);
        String introduce = teacher.introduce();
        assertEquals("My name is Tom. I am 18 years old. I am a teacher.", introduce);
    }

    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_same_id_teacher() {
        Teacher teacher1 = new Teacher(1, "Tom", 18);
        Teacher teacher2 = new Teacher(1, "Tom", 18);
        assertEquals(teacher1, teacher2);
    }

    // when equals two different id teacher then return true
    @Test
    public void should_return_false_when_equals_two_different_teacher() {
        Teacher teacher1 = new Teacher(1, "Tom", 18);
        Teacher teacher2 = new Teacher(2, "Tom", 18);
        assertNotEquals(teacher1, teacher2);
    }

}
