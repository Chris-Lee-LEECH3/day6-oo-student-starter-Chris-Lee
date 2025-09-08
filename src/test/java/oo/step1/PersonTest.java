package oo.step1;

import oo.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    // when introduce a person, then return a message with name and age
    @Test
    public void should_return_a_message_with_name_and_age_when_introduce_a_person() {
        Person person = new Person(1, "Tom", 18);
        String introduce = person.introduce();
        String expectedResult = "My name is Tom. I am 18 years old.";
        assertEquals(expectedResult, introduce);
    }

    // when equals two same id person then return true
    @Test
    public void should_return_true_when_equals_two_same_id_person() {
        Person person1 = new Person(1, "Tom", 20);
        Person person2 = new Person(1, "Tom", 20);
        assertTrue(person1.equals(person2));
    }

    // when equals two different id person then return false
    @Test
    public void should_return_false_when_equals_two_same_id_person() {
        Person person1 = new Person(1, "Tom", 20);
        Person person2 = new Person(2, "Michael", 20);
        assertFalse(person1.equals(person2));
    }

}
