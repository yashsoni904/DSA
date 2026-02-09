class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        if(k>n) return ans; 
        helper(1,k,n,ans,curr);
         return ans;
    }
    public void helper(int start ,int k,int n, List<List<Integer>> ans,List<Integer> curr){
        if(k==curr.size() && n==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>n) break;
            curr.add(i);
            helper(i+1,k,n-i,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}