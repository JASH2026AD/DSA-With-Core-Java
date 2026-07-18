class Person {

    String name = "Rahul";
}

class Student extends Person {

    int roll = 101;

    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class Man {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}
