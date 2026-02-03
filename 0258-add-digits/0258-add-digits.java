class Solution {
    public int addDigits(int num) {
        int n=num;
         while(n>=10){
            n=helper(n);         
         }
         return n;
    }
    public int helper(int num ){
        if(num==0) return 0 ;

        return num%10+ helper(num/10);
    }
}