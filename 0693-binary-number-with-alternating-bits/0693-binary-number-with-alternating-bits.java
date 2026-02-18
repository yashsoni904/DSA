class Solution {
    public boolean hasAlternatingBits(int n) {
        String s= Integer.toBinaryString(n);

        for(int i=0;i<=s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;
    }
}