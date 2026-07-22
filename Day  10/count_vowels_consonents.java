package Day10;

public class count_vowels_consonents {
    public static void main(String[] args) {
        String name = "education";
        String name1 = name.toLowerCase();
        char[] str = name1.toCharArray();
        int vowcount = 0;
        int concount = 0;

        for (char i:str) {

            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                vowcount++;
            }
            else if (i == 'b' || i == 'c' || i == 'd' || i == 'f' || i == 'g' || i == 'h' || i == 'j' || i == 'k' || i == 'l' || i == 'm' || i == 'n' || i == 'p' || i == 'q' || i == 'r' || i == 's' || i == 't' || i == 'v' || i == 'w' || i == 'x' || i == 'y' || i == 'z'){
                concount++;
            }

        }
        System.out.println(vowcount);
        System.out.println(concount);
    }
}