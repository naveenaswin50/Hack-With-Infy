import java.util.*;
public class Solution {
	public static String encode(String message) {
		// Write your code here.
        String str=message;
        int n=str.length();
        StringBuilder result=new StringBuilder();
        int c=1;
        for(int i=0;i<n;i++){
            char cchar=str.charAt(i);
            int fre=1;
            while(i+1<n&&str.charAt(i+1)==cchar){
                fre++;
                i++;
            }
            result.append(cchar);
            result.append(fre);
        }
        return result.toString();
	}
}
