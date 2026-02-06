class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans,List<Integer> curr, boolean[] used ){
         if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
         } 

         for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            used[i]=true;

            curr.add(nums[i]);
            helper(nums,ans,curr,used);

            curr.remove(curr.size()-1);
            used[i]=false;
         }
    }
}