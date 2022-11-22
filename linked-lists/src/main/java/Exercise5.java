public class Exercise5 {
    public static Node addLists(Node n1, Node n2, int carry) {
        if (n1 == null && n2 == null && carry == 0) {
            return null;
        }

        Node result = new Node(carry);

        /* add value from n1 and n2 */
        int value = carry;
        if (n1 != null) {
            value += n1.data;
        }
        if (n2 != null) {
            value += n2.data;
        }

        result.data = value % 10; /* Second digit of number */

        /* Recurse */
        if (n1 != null || n2 != null) {
            Node more = addLists(n1 == null ? null : n1.next,
                    n2 == null ? null : n2.next,
                    value >= 10 ? 1 : 0);
            result.appendNodeToTail(more);
        }
        return result;
    }

    public static class PartialSum {
        public Node sum = null;
        public int carry = 0;
    }

    public static Node addLists2(Node n1, Node n2) {
        int len1 = n1.length();
        int len2 = n2.length();

        /* Pad the shorter list with zeros */
        if (len1 < len2) {
            n1 = padList(n1, len2 -len1);
        } else {
            n2 = padList(n2, len1 - len2);
        }

        /* Add lists */
        PartialSum sum = addLists2Helper(n1, n2);

        /* If there was a carry value left over, insert this at the
        * front of the list. Otherwise, just return the linked list. */
        if (sum.carry == 0) {
            return sum.sum;
        } else {
            Node result = insertBefore(sum.sum, sum.carry);
            return result;
        }
    }

    static PartialSum addLists2Helper(Node n1, Node n2) {
        if (n1 == null && n2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }

        /* Add smaller digits recursively */
        PartialSum sum = addLists2Helper(n1.next, n2.next);

        /* Add carry to current data */
        int val = sum.carry + n1.data + n2.data;

        /* Insert sum of current digits */
        Node full_result = insertBefore(sum.sum, val % 10);

        /* return sum so far, and the current value */
        sum.sum = full_result;
        sum.carry = val / 10;
        return sum;
    }

    public static Node padList(Node node, int padding) {
        Node head = node;
        for (int i = 0; i < padding; i++) {
            Node n = new Node(0);
            head.prev = n;
            n.next = head;
            head = n;
        }
        return head;
    }

    public static Node insertBefore(Node node, int data) {
        Node n = new Node(data);
        if (node != null) {
            node.prev = n;
            n.next = node;
        }
        return n;
    }
}
