public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long max=arr[0];
        long sum=arr[0];
        for(int i=1;i<n;i++){
            sum+=arr[i];
            if(sum<0)
                sum=0;
            if(max<sum)
                max=sum;
        }
        return max;
	}

}
