package remove_duplicates_from_sorted_list;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();
	
	@org.junit.Test
	public void test1() {
		ListNode n1 =new ListNode(1);
		ListNode n2 =new ListNode(1);
		ListNode n3 =new ListNode(2);
		
		n1.next = n2;
		n2.next = n3;
		
		ListNode n = solution.deleteDuplicates(n1);
		
		assertEquals(1, n.val);
		n = n.next;
		assertEquals(2, n.val);
	}
	
	@org.junit.Test
	public void test2() {
		ListNode n1 =new ListNode(1);
		ListNode n2 =new ListNode(1);
		ListNode n3 =new ListNode(2);
		ListNode n4 =new ListNode(3);
		ListNode n5 =new ListNode(3);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode n = solution.deleteDuplicates(n1);
		
		assertEquals(1, n.val);
		n = n.next;
		assertEquals(2, n.val);
		n = n.next;
		assertEquals(3, n.val);
	}

}
