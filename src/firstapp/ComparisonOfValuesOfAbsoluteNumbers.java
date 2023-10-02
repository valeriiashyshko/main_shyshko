package firstapp;

public class ComparisonOfValuesOfAbsoluteNumbers {
    public static void main(String[] args) {
        compareValuesOfAbsoluteNumbers(2, -2);
    }

    public static void compareValuesOfAbsoluteNumbers(int num1, int num2) {
        int absoluteValueOfNum1, absoluteValueOfNum2;

        absoluteValueOfNum1 = Math.abs(num1);
        absoluteValueOfNum2 = Math.abs(num2);
        System.out.println("Absolute value is " + absoluteValueOfNum1);
        System.out.println("Absolute value is " + absoluteValueOfNum2);

        if (absoluteValueOfNum1 > absoluteValueOfNum2) {
            System.out.println(num1 + " has a bigger absolute value than " + num2);
        } else if (absoluteValueOfNum1 < absoluteValueOfNum2) {
            System.out.println(num2 + " has a bigger absolute value than " + num1);
        } else {
            System.out.println("Both numbers have an equal absolute value of " + absoluteValueOfNum1);
        }
    }
}
