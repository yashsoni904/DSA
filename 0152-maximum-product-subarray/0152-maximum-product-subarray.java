import java.util.Arrays;
class Solution {
    public int maxProduct(int[] nums) {
      if (nums.length==1) return nums[0];
      if (nums.length==0) return -1;
      int max=0;
      int mul=1;
      for(int i=0;i<nums.length;i++){
          mul*=nums[i];
          if(mul>max){
             max=mul;
          }
      }
      int max2=Arrays.stream(nums).max().getAsInt();
      if(max<=0 || max<max2){
        max=max2;
      }
      return max;

    }
}