public class Exercise6 {

    public static Node findStartOfCircularLinkedList(Node head) {
        Node slow = head;
        Node fast = head;

        /* Find meeting point. This will be LOOP_SIZE -k steps into
        * the linked list */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Collision
                break;
            }
        }

        /* Error check - no meeting point, therefore no loop */
        if (fast == null || fast.next == null) {
            return null;
        }

        /* Move slow to head. Keep fast at meeting point. Each are k
        * steps from the loop start. If they move at the same pace,
        * they must meet at the loop start */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        /* Both now point to the start of the loop. */
        return fast;
    }
}
