class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null; // If the tree is empty, return null
        }

        // Initialize a queue for level-order traversal
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();

            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr= q.poll();
                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            prev.next = null;
        }
        return root;
    }
}
