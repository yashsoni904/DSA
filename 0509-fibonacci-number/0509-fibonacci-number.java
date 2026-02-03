class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        
        int sum=0;
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            if(i==n-2 || i==n-1){
                sum+=a;
            }
            int c=a+b;
            a=b;
            b=c;
        }
        return sum;
    }
    
}