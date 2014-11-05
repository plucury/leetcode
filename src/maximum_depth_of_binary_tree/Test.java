package maximum_depth_of_binary_tree;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		TreeNode root = new TreeNode(1);
		int l = solution.maxDepth(root);
		assertEquals(1, l);
	}

	@org.junit.Test
	public void test2() {
		TreeNode l = new TreeNode(1);
		TreeNode root = new TreeNode(1);
		root.left = l;
		int len = solution.maxDepth(root);
		assertEquals(2, len);
	}

	@org.junit.Test
	public void test3() {
		TreeNode l = new TreeNode(1);
		TreeNode r = new TreeNode(1);
		TreeNode root = new TreeNode(1);
		root.left = l;
		root.right = r;
		int len = solution.maxDepth(root);
		assertEquals(2, len);
	}

	@org.junit.Test
	public void test4() {
		TreeNode l = new TreeNode(1);
		TreeNode l_l = new TreeNode(1);
		TreeNode root = new TreeNode(1);
		root.left = l;
		l.left = l_l;
		int len = solution.maxDepth(root);
		assertEquals(3, len);
	}

}
