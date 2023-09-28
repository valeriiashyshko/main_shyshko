package firstApp;

public class ComparisonOfValuesOfAbsoluteNumbers {
    public static void main(String[] args) {
        int num1 = 5, num2 = -7;
        int answer1, answer2;

        answer1 = Math.abs(num1);
        answer2 = Math.abs(num2);
        System.out.println("Absolute number for 5 is " + answer1);
        System.out.println("Absolute number for -7 is " + answer2);

        if (answer1 > answer2) {
            System.out.println("5 has a bigger absolute number than -7");
        }
        else {
            System.out.println("-7 has a bigger absolute number than 5");
        }
    }
}
