class Solution {
    public int scoreOfString(String s) {
        int result=0;
        for(int i=0;i<s.length()-1;i++ ){

            int sum=(s.charAt(i)-s.charAt(i+1));
            if(sum<0) sum=sum*-1;
            result+=sum; 
        }
        return result;
    }
}