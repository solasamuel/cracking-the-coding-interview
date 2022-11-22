public class Exercise4 {
    public static Node partitionListAroundNum(Node node, int num) {
        Node beforeNum = null;
        Node afterNum = null;

        while(node != null) {
            Node next = node.next;
            if (node.data < num) {
                // add to below num list
                node.next = beforeNum;
                beforeNum = node;
            } else {
                // add to after num list
                node.next = afterNum;
                afterNum = node;
            }
            node = next;
        }

        // merge lists
        if (beforeNum == null) {
            return afterNum;
        }

        // find end of before list, and merger the lists
        Node head = beforeNum;
        while(beforeNum != null) {
            beforeNum = beforeNum.next;
        }

        beforeNum.next = afterNum;

        return head;
    }
}
