package Day12;

import java.util.*;

class rev {

    int rev() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int a = sc.nextInt();

        int reverse = 0;

        while (a != 0) {
            int pop = a % 10;
            reverse = reverse * 10 + pop;
            a = a / 10;
        }

        return reverse;
    }
}

public class Reverse {
    public static void main(String[] args) {

        rev obj1 = new rev();

        System.out.println("Reverse = " + obj1.rev());
    }
}