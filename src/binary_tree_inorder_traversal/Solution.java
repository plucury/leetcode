package binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		return inorderTraversal(root, new ArrayList<Integer>());
	}

	private List<Integer> inorderTraversal(TreeNode node, List<Integer> l) {
		if (node == null)
			return l;
		l = inorderTraversal(node.left, l);
		l.add(node.val);
		l = inorderTraversal(node.right, l);
		return l;
	}
}
