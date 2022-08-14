public class Exercise5 {

    // two-scan approach
    public static String compress(String str) {
        // Check if compression would create a shorter string
        int size = countCompression(str);
        if (str.length() <= size) return str;

        // second scan to build string
        StringBuffer myStr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;

        for (int i=1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                myStr.append(last);
                myStr.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }

        myStr.append(last);
        myStr.append(count);
        return myStr.toString();
    }

    // first scan to count compression
    public static int countCompression(String str) {
        // null checks
        if (str == null || str.isEmpty()) return 0;

        char last = str.charAt(0);
        int size = 0;
        int count = 1;

        for (int i=1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }

        size += 1 + String.valueOf(count).length();
        return size;
    }
}
