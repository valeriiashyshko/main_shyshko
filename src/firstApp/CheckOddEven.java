package firstApp;

import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, remainder;
        System.out.println("Enter any number");
        num = scan.nextInt();
        scan.close();

        remainder = num % 2;
        if (remainder == 0) {
            System.out.println(num + " is an even number");
        }
        else
            System.out.println(num + " is an odd number");

        System.out.println("Bye!");
    }
}
