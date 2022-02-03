import java.util.ArrayList;

public class Solution {

	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		// Initialise both first and last occurences to -1, incase X is not found in array.
		int idx1 = -1, idx2 = -1;
		// Binary search to find the first position of occurence of X.
		int lo = 0, hi = n - 1;
		while (lo <= hi) {
			
			int mid = (lo + hi) / 2;
			// If arr[mid] == X and X > arr[mid-1], then mid is first occurrence of X, or
			// arr[mid] == X and mid == 0, then mid is first occurrence of X.
			if ((mid == 0 || x > arr.get(mid - 1)) && arr.get(mid) == x) {
				
				idx1 = mid;
				break;
			}

			// If X is greater than arr[mid] in sorted array, then X may only occur in [mid+1, hi] range of index.
			else if (x > arr.get(mid)) {
				
				lo = mid + 1;
			}

			// Else X may only occur in [lo, mid-1] range of index.
			else {
				
				hi = mid - 1;
			}

		}

		// Binary search to find the last position of occurence of X.
		lo = 0;
		hi = n - 1;
		while (lo <= hi) {
			
			int mid = (lo + hi) / 2;
			// If arr[mid] == X and mid == N-1 then, mid is last occurrence of X, or
			// arr[mid+1] > X and arr[mid] == X, then mid is last occurence of X.
			if ((mid == (n - 1) || x < arr.get(mid + 1)) && arr.get(mid) == x) {
				
				idx2 = mid;
				break;
			}

			// If X < arr.get(mid), then X may only occur in [lo, mid-1] range of index.
			else if (x < arr.get(mid)) {
				
				hi = mid - 1;
			}

			// Else X may only occur in [mid+1, hi] range of index.
			else {
				
				lo = mid + 1;
			}

		}

		Pair sol = new Pair();
		sol.first = idx1;
		sol.second = idx2;
		return sol;
	}
}
