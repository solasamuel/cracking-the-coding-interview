import java.util.List;
import java.util.Stack;

public class Exercise3 {

    public class SetOfStacks {
        List<Stack> stacks;
        int capacity;

        SetOfStacks(int capacity) {
            this.capacity = capacity;
        }

        Stack getLastStack() {
            if (stacks.size() == 0) return null;
            return stacks.get(-1);
        }

        public void push(int v) {
            Stack last = getLastStack();

            if (last == null || !last.isFull()) {
                last.push(v);
            } else {
                Stack stack = new Stack(capacity);
                stack.push(v);
                stacks.add(stack);
            }
        }

        public int pop() {
            Stack last = getLastStack();
            int v = (int) last.pop();
            if (last._size == 0) stacks.remove(stacks.size() - 1);
            return v;
        }

        public boolean isEmpty() {
            Stack last = getLastStack();
            return last == null || last.isEmpty();
        }

        public int popAt(int index) {
            return leftShift(index, true);
        }

        public int leftShift(int index, boolean removeTop) {
            Stack stack = stacks.get(index);
            int removed_item;

            if (removeTop) removed_item = stack.pop();
            else removed_item = stack.removeBottom();

            if (stack.isEmpty()) {
                stacks.remove(index);
            } else if (stacks.size() > index + 1) {
                int v = leftShift(index + 1, false);
                stack.push(v);
            }
            return removed_item;
        }
    }

    public class Stack {
        private int _capacity;
        public Node top, bottom;
        public int _size = 0;

        public Stack(int capacity) { this._capacity = capacity; }
        public boolean isFull() { return _capacity == _size; }

        public void join(Node above, Node below) {
            if (below != null) below.above = above;
            if (above != null) above.below = below;
        }

        public boolean push(int v) {
            if (_size >= _capacity) return false;
            _size++;
            Node n = new Node(v);
            if (_size == 1) bottom = n;
            join(n, top);
            top = n;
            return true;
        }

        public int pop() {
            Node t = top;
            top = top.below;
            _size--;
            return t.value;
        }

        public boolean isEmpty() {
            return _size == 0;
        }

        public int removeBottom() {
            Node b = bottom;
            bottom = bottom.above;
            if (bottom != null) bottom.below = null;
            _size--;
            return b.value;
        }
    }

    public class Node {
        int value;
        Node below;
        Node above;

        public Node(int v) {
            value = v;
        }
    }
}
