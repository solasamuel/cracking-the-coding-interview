import java.util.Hashtable;

public class Exercise1 {

    public static void removeDuplicates(Node n) {
        // O(N) time & more space used
//        Hashtable table = new Hashtable<>();
//        Node previous = null;
//        while (n != null) {
//            if (table.containsKey(n.data)) {
//                previous.next = n.next;
//            } else {
//                table.put(n.data, true);
//                previous = n;
//            }
//            n = n.next;
//        }

        // O(N^2) time & O(1) space
        if (n == null) return;

        Node current = n;
        while(current != null) {
            // remove future nodes with the same value
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
