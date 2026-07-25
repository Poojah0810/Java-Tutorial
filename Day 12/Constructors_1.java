package OOPS_Day_1;

class C {
    int id;
    String name;

    C(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Constructors_1 {
    public static void main(String[] args) {
        C a = new C(1, "Batman");
        a.display();
    }
}