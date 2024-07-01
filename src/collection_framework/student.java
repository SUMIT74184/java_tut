package collection_framework;

import java.util.Objects;

public class student {
    String name;
    int rollNo;
     public student(String name,int rollNo){
         this.name=name;
         this.rollNo=rollNo;
     }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
