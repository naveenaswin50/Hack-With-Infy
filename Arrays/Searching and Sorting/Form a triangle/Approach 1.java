import java.util.ArrayList;

public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		
		int n = arr.size();

		// Iterate for the first element.
		for (int i = 0; i < n; i++){

			// Iterate for the second element.
			for (int j = i + 1; j < n; j++){

				// Iterate for the third element.
				for (int k = j + 1; k < n; k++){

					// Check all conditions for a non- denegerate triangle.
					if ( (arr.get(i) + arr.get(j) > arr.get(k)) && (arr.get(j) + arr.get(k) > arr.get(i)) && (arr.get(k) + arr.get(i) > arr.get(j)) ){
						return true;
					}
				}
			}
		}

		// If no non-degenerate triangle can be formed return false.
		return false;
	}
}
