public class Solution {
    public static int search(int arr[], int key) {
        int n = arr.length;
        // Iterate through the array
        for (int i = 0; i < n; i++) {
        	
        	// key is found
            if (arr[i] == key) {
                return i;
            }
        }
        // key not found
        return -1;
    }
}
