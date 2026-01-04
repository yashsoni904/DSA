class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-rev(n));
    }
    public int rev(int num){
        int ans=0;
        while(num>0){
            int digit = num%10;
            ans =ans*10+digit;
            num/=10;
        }
        return ans;
    }
}