package Day10;

public class methods {
    public static void main(String[] args) {
        String name = "  hello world  ";
        System.out.println(name.trim());

        // replace method
        String name1 = "heloooo";
        System.out.println(name1.replace('o','e'));


        //replace all method
        System.out.println(name1.replaceAll("heloooo","vidhya"));

        //replace all method
        String name2="hello world";
        System.out.println(name2.replaceFirst("hello","hi"));

        //contains method
        String name3=" i like java program";
        System.out.println(name3.contains("java"));
        System.out.println(name3.contains("python"));

        //split method
        String name4="apple,orange,mango";
        String []fruits=name4.split(",");
        for(int i=0;i<= fruits.length-1;i++) {
            System.out.println(fruits[i]);
        }
    }
}



