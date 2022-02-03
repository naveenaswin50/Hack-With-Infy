public class Solution{
	public static String convertString(String str) {
            // Write your code here
        String result="";
       	String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            result+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
        }
        return (result.trim());
    }
}
