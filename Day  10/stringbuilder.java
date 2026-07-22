package Day10;

public class stringbuilder {
    public static void main(String []args){
        StringBuilder name=new StringBuilder("hello");
        System.out.println(name.append("world"));

        //insert method
        name.insert(3,"l");
        System.out.println(name);

        //replace method
        name.replace(0,4,"vidhya");
        System.out.println(name);

        //delete
        name.delete(1,3);
        System.out.println(name);

        //
    }
}
