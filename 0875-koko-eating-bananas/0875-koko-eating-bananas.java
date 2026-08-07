class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1 ;
       int high = Arrays.stream(piles).max().getAsInt();
       int ans=high;
       while(low<=high){
          int mid = low + (high-low)/2;
          long min=0;
          for(int pile:piles ){
             min = min + (pile+mid-1)/mid;
          }
          if(min<=h){
             ans=mid;
             high=mid-1;
          }
          else{
             low=mid+1;
          }
       }
       return ans;

    }
}