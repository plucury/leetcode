package linked_list_cycle;

public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		if (head.next == head)
			return true;
		ListNode next = head.next;
		head.next = head;
		return hasCycle(next);
	}
}
