package oo;

public class Student extends Person{

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a student.";
    }

}
