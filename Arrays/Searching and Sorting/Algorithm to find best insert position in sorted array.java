public class Solution {	
	public static int bestInsertPos(int [] arr, int n, int m){
		if(n==0){
            return 0;
        }else if(arr[0]>m){
            return 0;
        }else if(arr[n-1]<m){
            return n;
        }else{
            int s=0;
            int e=n-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==m||(mid>0&&arr[mid-1]<m&&arr[mid]>=m)){
                    return mid;
                }else if(arr[mid]>m){
                    e=mid-1;
                }else if(arr[mid]<m){
                    s=mid+1;
                }
            }
        }
        return -1;
	}
}
