public class Solution {
	public static int minimumParentheses(String pattern) {
        String str=pattern;
        int n=str.length();
        int opb=0;
        int clb=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(')opb++;
            else clb++;
            if(clb>opb){
                c+=clb-opb;
                clb=0;
                opb=0;
            }
        }
        return (c+=opb-clb);
	}
}
