package populating_next_right_pointers_in_each_node;

public class Solution {
	public void connect(TreeLinkNode root) {
		if (root == null || root.left == null)
			return;

		root.left.next = root.right;
		if (root.next != null)
			root.right.next = root.next.left;
		connect(root.left);
		connect(root.right);
	}
}
