class Solution {
    public void reverseString(char[] s) {
       helper(s , 0 , s.length-1);
    }
    public void helper(char[] s ,int f ,int l){
        if(f>=l){
            return;
        }
        char c = s[f];
        s[f]=s[l];
        s[l]=c;
        helper(s , f+1 , l-1);

    }

}