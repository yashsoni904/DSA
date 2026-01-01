class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt=0;
        int n=nums.size();
        int i=0;
        int j=1;
        while(i<n && j<n){
           
           if(i<j){
              if(nums.get(i)+nums.get(j)<target){
                cnt++;
                
              }
           }
           j++;
           if(j==n) {
            j=i+1;
            i++;
           }
        }
        return cnt;
    }
}