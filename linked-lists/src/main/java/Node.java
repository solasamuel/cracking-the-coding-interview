public class Node {
    Node next = null;
    Node prev = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node n = this;
        if (n == null) {
            this.data = d;
        } else {
            Node end = new Node(d);
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }

    void appendNodeToTail(Node n) {
        if (this == null) {
            this.data = n.data;
            this.next = n.next;
        } else {
            Node end = this;
            while (end.next != null) {
                end = end.next;
            }
            end.next = n;
            n.prev = end;
        }
    }

    void deleteNode(int d) {
        Node n = this;
        if (n.data == d) {
            this.data = this.next.data;
            this.next = this.next.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                n.next.prev = n;
                return;
            }
            n = n.next;
        }
    }

    boolean equals(Node other) {
        Node m = this;
        Node n = other;

        while (n.next != null && m.next != null) {
            System.out.print(m.data);
            System.out.print(" ");
            System.out.println(n.data);
            if (m.data != n.data) return false;
            n = n.next;
            m = m.next;
        }

        System.out.print(m.data);
        System.out.print(" ");
        System.out.println(n.data);

        if (m.next != null && n.next == null) return false;
        if (m.next == null && n.next != null) return false;

        return true;
    }

    int length() {
        if (this == null) {
            return 0;
        }
        int len = 1;
        Node n = this;
        while (n.next != null) {
            len++;
            n = n.next;
        }
        return len;
    }

}
