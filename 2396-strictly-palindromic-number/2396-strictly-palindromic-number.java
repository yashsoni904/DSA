class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!ispalin(Integer.toString(n,i))) return false;
        }
        return true;
    }
    public boolean ispalin(String s){
        int l=0 ; 
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}