class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        com(0,candidates , target , outer , new ArrayList<>());
        return outer;
    }
    public void com(int start,int[] candidates , int target ,List<List<Integer>> outer , List<Integer> list ){
        if(target==0){
            outer.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return ;
        for(int i=start;i<candidates.length;i++){
            list.add(candidates[i]);
            com(i,candidates , target-candidates[i] , outer , list);
            list.remove(list.size()-1);
        }
    }
}