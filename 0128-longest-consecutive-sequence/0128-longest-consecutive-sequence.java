class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int max=0;
        
        for(int num : set){
            // Only start if previous number doesn't exist
            if(!set.contains(num-1)){
                int currnum = num; 
                int count = 1;

                while(set.contains(currnum+1)){
                    currnum++;
                    count++;
                }

                max = Math.max(count,max);
            }
        }

        return max;

    }
}