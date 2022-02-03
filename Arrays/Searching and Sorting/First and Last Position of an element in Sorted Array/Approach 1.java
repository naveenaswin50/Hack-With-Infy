import java.util.ArrayList;

public class Solution {

	public static Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
		// Initialise both first and last occurences to -1, incase X is not found in array.
		int idx1 = -1, idx2 = -1;
		for (int i = 0; i < n; i++) {
			
			// If the current element equals to X.
			if (arr.get(i) == x) {
				
				// If previously element was not found, it is X's first occurrence.
				if (idx1 == -1 && idx2 == -1) {

					idx1 = i;
					idx2 = i;
				}

				else {
					
					// Otherwise update last occurrence of X.
					idx2 = i;
				}

			}

		}

		Pair sol = new Pair();
		sol.first = idx1;
		sol.second = idx2;
		return sol;

	}

}
