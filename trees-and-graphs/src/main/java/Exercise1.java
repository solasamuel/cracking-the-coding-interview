
public class Exercise1 {
    public static class TreeNode {
        private int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v) {
            value = v;
        }

        public int getValue() {
            return value;
        }
    }

    public static int checkHeight(TreeNode root) {
        if(root == null) return 0;

        /* Check if left is balanced */
        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1; // not balanced

        /* Check if right is balanced */
        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // not balanced

        /* Check that current node is balanced */
        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return -1; // not balanced
        } else {
            /* Return height */
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        if (checkHeight(root) == -1) {
            return false;
        } else {
            return true;
        }
    }
}
