class Solution {
    public boolean isPowerOfFour(int n) {

        while(n!=0){
            if(n%4==0){
                n/=4;
            }
            else if(n==1) return true;
            else{
                return false;
            }
        }
        return true;
    }
}