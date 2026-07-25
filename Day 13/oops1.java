package OOPS_Day_2;
class D{
    void display(){
        System.out.println("Batman");
    }
}
class E extends A{
    void show(){
        System.out.println("Catwoman");
    }
}
class F extends E{
    void fly(){
        System.out.println("Dog");
    }
}
public class oops1 {
    public static void main(String[] args) {
        D d = new D();
        E e = new E();
        F f = new F();
        e.show();
        e.display();
        f.fly();
    }
}
