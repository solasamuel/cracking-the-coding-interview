import java.util.Arrays;

public class Exercise3 {

    public static boolean checkIfTwoStringsArePermutations(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] characters = new int[256]; // Assuming ASCII Character

        char[] s1_array = s1.toCharArray();
        for (char c: s1_array) {
            // count the number of each character in s1
            characters[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s2.charAt(i);
            if (--characters[c] < 0) {
                return false;
            }
        }

        return true;

    }
}
