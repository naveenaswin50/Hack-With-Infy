import java.util.ArrayList;
import java.util.Collections;

public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		// Sort the array in non-decreasing order.
		Collections.sort(arr);

		int n = arr.size();

		// Iterate the array/list.
		for (int i = 0; i < n - 2; i++){

			// Return true if sum of first 2 elements is greater than the 3rd element.
			if (arr.get(i) + arr.get(i + 1) > arr.get(i + 2)){
				return true;
			}
		}

		// If no non-degenerate triangle can be formed return false.
		return false;
	}
}
