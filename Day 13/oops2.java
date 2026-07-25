package OOPS_Day_2;
class H{
    void display(){
        System.out.println("Batman");
    }
}
class I extends H{
    void show(){
        System.out.println("VS");
    }
}
class J extends I{
    void fly(){
        System.out.println("Superman");
    }
}
public class oops2 {
    public static void main(String[] args) {
        H h=new H();
        I i=new I();
        J j=new J();
        h.display();
        i.show();
        j.fly();
    }
}
