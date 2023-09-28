package firstApp;

import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter value A ");
        a = scan.nextInt();
        System.out.println("Enter value B ");
        b = scan.nextInt();
        System.out.println("Enter value C ");
        c = scan.nextInt();
        scan.close();

        if (a == b) {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is not isosceles");
        }
    }
}
