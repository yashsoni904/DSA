class Solution {
    public int titleToNumber(String columnTitle) {
         int ans = 0 ;
        for(int i = 0 ; i < columnTitle.length() ; i++){
            int c = columnTitle.charAt(i) - 64;
            ans = ans * 26 + c;
        }
        return ans ;
    }
}