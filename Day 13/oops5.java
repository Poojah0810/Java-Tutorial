package OOPS_Day_2;

class M{
    private int a;
    private int b;
    private String name;
    M(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }
    void setID(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int getM(){
        return this.a;
    }
    int getN(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }
}
public class oops5 {
    public static void main(String[] args) {
        M a = new M(10,20,"Batman");
        a.display();
    }
}
