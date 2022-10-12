public class Palindrome {

    public static void main(String[] args) {
//      цикл проверяющий введенные слова

        for (String line : args) {
            System.out.println(isPalindrome(line) + " " + line);
        }

    }

    //  метод для переворота слова
    public static String reverseString(String word) {
        int lens = word.length();
        String newWord = "";
        for (int i = lens - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }

    //  проверка слова
    public static boolean isPalindrome(String s) {
        String changeWord = reverseString(s);
        return s.equals(changeWord);
    }
}