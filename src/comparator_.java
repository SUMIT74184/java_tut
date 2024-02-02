import java.util.*;


//comparator are nothing but the desirable logic we are applying to sort the element
//comparable provide the power to there class itself to compare it's object
class stu implements Comparable<stu> {
    int age;
    String name;

    public stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student[age=" + age + ",name=" + name + "]";
    }

    @Override
    public int compareTo(stu that) {
        return Integer.compare(this.age, that.age);
    }
}

public class comparator_ {
    // comparator is an interface
    static Comparator<stu> com = new Comparator<stu>() {
        @Override
        public int compare(stu i, stu j) {
            return Integer.compare(i.age, j.age);
        }
    };

    public static void main(String[] a) {
        List<stu> s1 = new ArrayList<>();
        s1.add(new stu(21, "deewan"));
        s1.add(new stu(26, "niharika"));
        s1.add(new stu(25, "ajay"));
        s1.add(new stu(18, "meenakshi"));
        s1.add(new stu(29, "neeraj"));

        Collections.sort(s1, com);

        // class name // object name
        for (stu s : s1) {
            System.out.println(s);
        }
    }
}
