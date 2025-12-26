class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int[] count = new int[nums.length];
        int i=0;
        for(int num:nums){
            if(count[num]==0) count[num]++;
            else{
                arr[i++]=num;
            }

        }
        return arr;
    }
}