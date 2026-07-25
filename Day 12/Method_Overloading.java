package OOPS_Day_1;
class Q{
    int A(){
        return 1;
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void display(){
        System.out.println("hello world");
    }
}

public class Method_Overloading {
    public static void main(String[] args){
        Q a=new Q();
        int e=a.A();
        System.out.println(e);
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(1,2));
    }
}