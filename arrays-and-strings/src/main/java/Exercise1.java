public class Exercise1 {

    public static boolean checkIfStringHasAllUniqueCharacters(String str) {

        if (str.length() < 1) {
            return false;
        }

        // Assuming we go by ASCII characters
        boolean[] store = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (store[ascii] == true) {
                return false;
            }
            else {
                store[ascii] = true;
            }

        }

        return true;
    }
}
