package maximum_depth_of_binary_tree;

public class Solution {
	public int maxDepth(TreeNode root) {
		return getDep(root);
	}

	public int getDep(TreeNode n) {
		if (n == null)
			return 0;
		return Math.max(getDep(n.left), getDep(n.right)) + 1;
	}

}
