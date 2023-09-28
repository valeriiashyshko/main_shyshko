package firstApp;

public class FetchTwoMiddleCharacters {
    public static void main(String[] args) {
        String l1 = "Fire";
        String l2 = "Original";
        String l3 = "Eucalyptus";

        String middleLetters1 = getMiddleTwoLetters(l1);
        String middleLetters2 = getMiddleTwoLetters(l2);
        String middleLetters3 = getMiddleTwoLetters(l3);

        System.out.println(middleLetters1);
        System.out.println(middleLetters2);
        System.out.println(middleLetters3);
    }
    public static String getMiddleTwoLetters(String l) {
        int middle = l.length() / 2;
        String middleLetters = l.substring(middle -1, middle +1);
        return middleLetters;
    }
}
