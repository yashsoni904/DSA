class Solution {
    public int addDigits(int num) {
        if((num/10)==0) return num;
        int n=num;
        
        while(n>=10){
            int sum=0;
            while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
            }
            n=sum;
        }
        return n;
    }
}