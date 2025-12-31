class Solution {
    public int findClosest(int x, int y, int z) {
        int f = Math.abs(x-z);
        int s = Math.abs(y-z);
        if(f>s) return 2;
        else if(f<s) return 1;
        return 0;
}
}