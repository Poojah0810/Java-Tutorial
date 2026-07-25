package OOPS_Day_1;
class B{
    int age;
    int id;
    String name;
    B(){
        System.out.println("A");
    }
    B(int n){
        System.out.println(n+n);
    }
    B(String s){
        System.out.println(s);
    }
    B(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println(age+" "+name+" " +id);
    }
}
public class Constructors {
    public static void main(String[] args){
        B person1=new B(20,"BATMAN",100);
        B person2=new B(21,"SIVA",101);
        person1.display();
        person2.display();
    }
}