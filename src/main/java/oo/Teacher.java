package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private List<Klass> klasses = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }
    
    @Override
    public String introduce() {
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a teacher. I teach Class " +
                this.klasses.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", ")) + ".";
    }

    public boolean belongsTo(Klass klass) {
        return this.klasses.contains(klass);
    }

    public void assignTo(Klass klass) {
        if (!this.klasses.contains(klass)) {
            this.klasses.add(klass);
        }
    }

    public boolean isTeaching(Student student) {
        return this.klasses.contains(student.getKlass());
    }

}
