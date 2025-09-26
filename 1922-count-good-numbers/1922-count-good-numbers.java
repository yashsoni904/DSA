class Solution {
    public final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenPos=(n+1)/2;
        long oddPos=n/2;
        long powerOfEven =power(5 , evenPos);
        long powerOfodd = power(4 , oddPos);
        return (int)((powerOfEven*powerOfodd)%MOD);
    }
    public long power(long a , long b){
         if(b==0){
            return 1;
         }
         long half = power(a, b/2);
         long result = (half * half) % MOD; 
         if( b % 2 ==1){
            result = (result * a)%MOD;
         }
         return result ;
    }
}