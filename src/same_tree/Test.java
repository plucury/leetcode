package same_tree;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(1);
		assertEquals(true, solution.isSameTree(p, q));
	}

	@org.junit.Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(2);
		assertEquals(false, solution.isSameTree(p, q));
	}

	@org.junit.Test
	public void test3() {
		TreeNode l = new TreeNode(1);
		TreeNode r = new TreeNode(1);
		TreeNode p = new TreeNode(1);
		p.left = l;
		p.right = r;
		TreeNode q = new TreeNode(1);
		assertEquals(false, solution.isSameTree(p, q));
	}

}
