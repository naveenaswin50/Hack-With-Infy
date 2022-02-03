import java.util.ArrayList;
public class Solution {
	public static long Solution(ArrayList <Integer> arr, int n, int k){
	     long maxsum = Long.MIN_VALUE;
	     long sum = 0; 	  
	    for (int i = 0; i < n * k; i++){ 
	        sum += arr.get(i % n); 
	        maxsum = Math.max(maxsum, sum);	  
	        if (sum < 0){
	            sum = 0;
	        } 
	    } 
	    return maxsum;
    }
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		long max=0;
        if(k==1){
            max=Solution(arr,n,k);
            return max;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
        }
        if(sum<=0){
            max=Solution(arr,n,2);
        }else{
			max=Solution(arr, n, 2);
	        max+=(long)(k - 2)*(long)sum;       
         }
        return max;
	}
}
