package OOPS_Day_2;
class K{
    K(){
        super();
        System.out.println("print the value K");
    }
    K(int a){
        this();
        System.out.println("print the value K" +a);
    }
}
class L extends K{
    L(){
        }
        L(int a,int b){

        }
        L(int a){
        this();
        System.out.println("print the value L"+a);
        }
}
public class oops3 {
    public static void main(String[] args) {
        L l = new L();

    }

}
