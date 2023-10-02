package firstapp;

public class FetchTwoMiddleCharacters {
    public static void main(String[] args) {

        String middleLetters1 = getMiddleTwoLetters("Fire");
        String middleLetters2 = getMiddleTwoLetters("Original");
        String middleLetters3 = getMiddleTwoLetters("Eucalyptus");

        System.out.println(middleLetters1);
        System.out.println(middleLetters2);
        System.out.println(middleLetters3);
    }

    public static String getMiddleTwoLetters(String word) {
        int middle = word.length() / 2;
        return word.substring(middle - 1, middle + 1);
    }
}
