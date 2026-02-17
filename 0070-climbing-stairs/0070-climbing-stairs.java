class Solution {
    public int climbStairs(int n) {
         if(n<=1) return n;
       int pre2=0;
       int pre1=1;
       for(int i=0;i<n;i++){
          int curr = pre2+pre1;
          pre2=pre1;
          pre1=curr;
       }
       return pre1;
    }
}