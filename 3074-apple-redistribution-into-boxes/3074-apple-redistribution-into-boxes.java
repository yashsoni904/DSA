class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i:apple) sum+=i;
        Arrays.sort(capacity);
        int n=capacity.length-1;
       
        int cap=0;
        for(int i=n;i>=0;i--){
            cap+= capacity[i];
            if(cap>=sum){
                return n+1-i;
            }
        }
        return -1;
    }
}