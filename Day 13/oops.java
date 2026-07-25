package OOPS_Day_2;
class A{
    void display(){
        System.out.println("Hello World");
    }
}
class B extends A{
    void show(){
        System.out.println("I Am Batman");
    }
}
public class oops{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.show();
        b.display();
    }

}
