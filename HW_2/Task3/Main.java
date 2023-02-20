package Task3;
public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Дорого небо да надобен огород"));
    }
    
    public static boolean isPalindrome(String s) {

        String str = s.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < str.length() /2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;

        }
        return true;
    }
}

