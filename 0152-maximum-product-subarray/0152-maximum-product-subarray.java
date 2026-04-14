import java.util.Arrays;
class Solution {
    public int maxProduct(int[] nums) {
      if (nums.length==1) return nums[0];
      if (nums.length==0) return -1;
     
      int max=Integer.MIN_VALUE;
      int pre=1;
      int suf=1;
      for(int i=0;i<nums.length;i++){
          if(pre==0)  pre=1;   
          if(suf==0)  suf=1;

          pre=pre*nums[i];
          suf=suf*nums[nums.length-1-i];   
          max=Math.max(max , Math.max(pre , suf));
      }
      
      return max;

    }
}