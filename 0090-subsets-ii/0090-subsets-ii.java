class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort)(nums);
        helper(nums, 0 , new ArrayList<>() ,ans );
        return ans;
    }
    public void helper(int[] arr,int idx ,List<Integer> curr,List<List<Integer>> ans){
       
        ans.add(new ArrayList<>(curr));
            
        for(int i=idx;i<arr.length;i++){
        if(idx<i && arr[i]==arr[i-1]) continue ;
        
        curr.add(arr[i]);
        helper(arr,i+1,curr ,ans);
        curr.remove(curr.size()-1);
        }
        
    }
}