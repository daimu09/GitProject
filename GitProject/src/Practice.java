import java.util.Arrays;

public class Practice {

    public static boolean isValidAnagram(String s, String t) {
        // Check if both strings have the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Compare sorted arrays
        return Arrays.equals(charArrayS, charArrayT);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if (isValidAnagram(s, t)) {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are valid anagrams.");
        } else {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are not valid anagrams.");
        }
    }
}