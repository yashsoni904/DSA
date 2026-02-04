class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list;
        helper(nums , result,new ArrayList<>(),0);
        return result;
    }
    public void helper(int[] nums,List<List<Integer>> result ,List<Integer> list,int i){
        if(i==nums.length){
          result.add(new ArrayList<>(list));
          return;
        }

        helper(nums , result,list,i+1);
        list.add(nums[i]);
        helper(nums , result,list,i+1);
        list.remove(list.size()-1);
        
    }
}