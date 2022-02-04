import java.util.*;
public class Solution {
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        List<Integer>ls=new ArrayList<>();
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(a[i]>=b[j]){
                    c++;
                }else{
                    break;
                }
            }
            ls.add(c);
        }
        return ls;
    }
}
