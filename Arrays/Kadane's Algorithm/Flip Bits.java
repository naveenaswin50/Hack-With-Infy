public class Solution {
	public static int flipBits(int[] arr,int n) {
        int max=0,cmax=0,ones=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int val;
            if(num==1){
                ones++;
                val=-1;
            }else{
                val=1;
            }
            cmax=Math.max(val,cmax+val);
            max=Math.max(max,cmax);
        } 
         return(ones+max);
	}
}
