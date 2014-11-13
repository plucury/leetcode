package binary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);

		n1.right = n2;
		n2.left = n3;

		List<Integer> r = solution.preorderTraversal(n1);
		List<Integer> e = new ArrayList<Integer>();
		e.add(1);
		e.add(2);
		e.add(3);
		for (int i = 0; i < e.size(); i++) {
			assertEquals(e.get(i), r.get(i));
		}
	}
}
