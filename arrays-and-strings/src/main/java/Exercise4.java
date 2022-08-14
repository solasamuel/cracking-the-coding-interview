public class Exercise4 {

    public static void replaceAllSpaces(char[] str, int len) {
        // two-scan approach
        // first scan to count how many spaces
        int spaceCount = 0, newLength, i;
        for (i = 0; i < len; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = len + spaceCount * 2;
        // second scan to replace the spaces
        for (i = len - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength-1] = str[i];
                newLength = newLength - 1;
            }
        }
    }
}
