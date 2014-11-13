package binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		return preorderTraversal(root, new ArrayList<Integer>());
	}

	private List<Integer> preorderTraversal(TreeNode node, List<Integer> l) {
		if (node == null)
			return l;
		l.add(node.val);
		l = preorderTraversal(node.left, l);
		l = preorderTraversal(node.right, l);
		return l;
	}
}
