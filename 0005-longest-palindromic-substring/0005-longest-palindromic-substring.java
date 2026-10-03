class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            String odd = expand(s, i , i);
            String even =expand(s, i, i+1);
            if(odd.length() > ans.length()){
                  ans = odd;
            }
            if(even.length() > ans.length()){
                  ans = even;
            }
        }
        return ans;
    }
    public String expand(String str , int l , int r){
        
        while( l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            l--;
            r++;
        }
        return str.substring(l+1 , r);
    }
}