package OOPS_Day_1;

class A {
    int id;
    String name;
    String name1;

    // Constructor 1
    A(int id) {
        this.id = id;
    }

    // Constructor 2
    A(String name) {
        this.name = name;
    }

    // Constructor 3
    A(String name1, String name2) {
        this.name1 = name1;
        this.name = name2;
    }

    // Constructor 4
    A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID = " + id + " Name = " + name + " Name1 = " + name1);
    }
}

public class Constructor_Overloading {

    public static void main(String[] args) {

        A obj = new A(10);
        A obj1 = new A("Siva");
        A obj2 = new A("Siva", "Balan");
        A obj3 = new A(101, "Batman");

        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}