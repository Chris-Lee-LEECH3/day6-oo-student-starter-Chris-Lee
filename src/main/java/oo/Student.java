package oo;

public class Student extends Person{

    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (this.klass != null) {
            if (this.klass.isLeader(this)) {
                return  "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a student. I am the leader of class " + this.klass.getNumber() + ".";
            }
            return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a student. I am in class " + this.klass.getNumber() + ".";
        }

        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old. I am a student.";
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        if (this.klass == null) {
            return false;
        }
        return this.klass.equals(klass);
    }

}
