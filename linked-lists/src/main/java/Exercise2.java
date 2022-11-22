public class Exercise2 {

    public static Node findKthToTheLastElement(Node head, int k) {
        // single pointer method
//        Node n = head;
//        int size = 0;
//
//        while(n.next != null) {
//            n = n.next;
//            size++;
//        }
//
//        if (k > size) return Integer.MIN_VALUE;
//
//        int j = size - k;
//        n = head;
//
//        while (j > 0) {
//            n = n.next;
//            j--;
//        }
//
//        return n.data;

        // double pointer method
        if  (k <= 0) return null;

        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        if (p2 == null) return null;

        // move both pointer till p2 get to the end
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
