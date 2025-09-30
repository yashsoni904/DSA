class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        com(1 , n ,k ,new ArrayList<>() , ans);
        return ans; 
    }
    public void com(int start ,int n, int k, ArrayList<Integer> list, List<List<Integer>> ans){
        if(k==list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i =start ; i<=n; i++){
            list.add(i);
            com(i+1 ,n ,k , list,ans);
            list.remove(list.size()-1);
        }
    }
}