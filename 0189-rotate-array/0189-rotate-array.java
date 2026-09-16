class Solution {
    public void rotate(int[] nums, int k) {
       if(k==0) return;
       int n=nums.length;
       k=k%n;
       swap(nums , 0 , n-1);
       swap(nums , 0, k-1);
       swap(nums , k , n-1);
      
    }
    public void swap(int[] nums, int i , int j){
        while(i<=j){
            int t = nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}