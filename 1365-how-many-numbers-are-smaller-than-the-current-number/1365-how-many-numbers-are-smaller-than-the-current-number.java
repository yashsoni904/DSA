class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr =new int[nums.length];
        int[] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i];
        HashMap<Integer, Integer> map =new HashMap<>();
        Arrays.sort(arr);
        ans[0]=0;
        int i=1;
        while(i<arr.length){
            if(arr[i-1]!=arr[i]){
                ans[i]=i;
                map.put(arr[i],i);
            }
            if(arr[i-1]==arr[i]) {
                ans[i]=ans[i-1];
                map.put(arr[i],ans[i-1]);
            }
            i++;
        }
        for(int k=0;k<nums.length;k++){
            if(map.containsKey(nums[k])){
              arr[k]=map.get(nums[k]);
            }
            else{
                arr[k]=0;
            }
        }
        return arr;
        

    }
}