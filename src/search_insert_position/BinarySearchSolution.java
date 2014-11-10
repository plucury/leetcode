package search_insert_position;

public class BinarySearchSolution {
	public int searchInsert(int[] A, int target) {
		if (A.length == 0)
			return 0;

		int start = 0;
		int end = A.length - 1;
		while (end - start > 1) {
			int mid = (start + end) / 2;
			if (A[mid] == target)
				return mid;
			else if (A[mid] < target)
				start = mid;
			else
				end = mid;
		}
		return A[start] >= target ? start : A[end] < target ? end + 1 : end;

	}
}
