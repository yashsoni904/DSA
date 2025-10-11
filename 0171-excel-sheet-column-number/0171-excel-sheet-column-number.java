class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(char c:columnTitle.toCharArray()){
            n=n*26+(c-'A'+1);
        }
        return n;
    }
}