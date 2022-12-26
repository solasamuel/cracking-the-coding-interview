import java.util.Stack;

public class Exercise5 {

    public static class MyQueue<Object> {
        Stack<Object> stackOldest, stackNewest;

        public MyQueue() {
            stackNewest = new Stack<>();
            stackOldest = new Stack<>();
        }

        public int size() {
            return stackOldest.size() + stackNewest.size();
        }

        public void add(Object value) {
            /* Push onto stackNewest, which always has the newest
            *   elements on top */
            stackNewest.push(value);
        }

        /* Move elements from stackNewest intO stackOldest. This is
        * usually done so that we can do operations on stackOldest */
        private void shiftStacks() {
            if (stackOldest.isEmpty()) {
                while (!stackNewest.isEmpty()) {
                    stackOldest.push(stackNewest.pop());
                }
            }
        }

        public Object peek() {
            shiftStacks(); // Ensure stackOldest has the current elements
            return stackOldest.peek(); // retrieve the oldest item.
        }

        public Object remove() {
            shiftStacks(); // Ensure stackOldest has the current elements
            return stackOldest.pop(); // retrieve the oldest item.
        }
    }
}
