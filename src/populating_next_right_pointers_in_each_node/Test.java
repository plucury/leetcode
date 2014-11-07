package populating_next_right_pointers_in_each_node;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {

		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		solution.connect(n1);
		assertEquals(null, n1.next);
		assertEquals(n3, n2.next);
		assertEquals(null, n3.next);
		assertEquals(n5, n4.next);
		assertEquals(n6, n5.next);
		assertEquals(n7, n6.next);
		assertEquals(null, n7.next);
	}

	@org.junit.Test
	public void test2() {

		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		TreeLinkNode n8 = new TreeLinkNode(8);
		TreeLinkNode n9 = new TreeLinkNode(9);
		TreeLinkNode n10 = new TreeLinkNode(10);
		TreeLinkNode n11 = new TreeLinkNode(11);
		TreeLinkNode n12 = new TreeLinkNode(12);
		TreeLinkNode n13 = new TreeLinkNode(13);
		TreeLinkNode n14 = new TreeLinkNode(14);
		TreeLinkNode n15 = new TreeLinkNode(15);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n4.right = n9;
		n5.left = n10;
		n5.right = n11;
		n6.left = n12;
		n6.right = n13;
		n7.left = n14;
		n7.right = n15;

		solution.connect(n1);
		assertEquals(null, n1.next);
		assertEquals(n3, n2.next);
		assertEquals(null, n3.next);
		assertEquals(n5, n4.next);
		assertEquals(n6, n5.next);
		assertEquals(n7, n6.next);
		assertEquals(null, n7.next);
		assertEquals(n9, n8.next);
		assertEquals(n10, n9.next);
		assertEquals(n11, n10.next);
		assertEquals(n12, n11.next);
		assertEquals(n13, n12.next);
		assertEquals(n14, n13.next);
		assertEquals(n15, n14.next);
		assertEquals(null, n15.next);
	}

}
