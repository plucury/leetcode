package remove_duplicates_from_sorted_list;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode n = head;
		while (n != null) {
			while (n.next != null && n.val == n.next.val)
				n.next = n.next.next;
			n = n.next;
		}
		return head;
	}
}
