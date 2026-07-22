package Day10;

public class revrse_string {
    public static void main(String[]args){
        String name="Vidhya";
        char []chars=name.toCharArray();
        int start=0;
        int end =chars.length-1;
        while(start<=end)
        {

            char temp =chars[start];
            chars[start] =chars [end];
            chars[end]=temp;
            start++;
            end--;
        }
        String s=new String(chars);
        System.out.println(s);


    }
}
