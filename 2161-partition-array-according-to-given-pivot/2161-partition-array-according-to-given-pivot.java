class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less =new ArrayList<>();
        ArrayList<Integer> more =new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) less.add(nums[i]);
            if(nums[i]>pivot) more.add(nums[i]);
            if(nums[i]==pivot) count++;
        }
        int lessSize=less.size();
        int moreSize=more.size();
        int i=0,j=0,k=0,p=0;
        while(i<nums.length && j<lessSize){
            nums[i++]=less.get(j++);
        }
        while(i<nums.length && p<count){
            nums[i++]=pivot;
            p++;
        }
         while(i<nums.length && k<moreSize){
            nums[i++]=more.get(k++);
        }
        return nums;
    }
}