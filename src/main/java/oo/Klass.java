package oo;

import java.util.Objects;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public void assignLeader(Student leader) {
        if (!leader.isIn(this)) {
            System.out.println("It is not one of us.");
            return;
        }

        this.leader = leader;
    }

    public boolean isLeader(Student student) {
        return this.leader.equals(student);
    }

}
