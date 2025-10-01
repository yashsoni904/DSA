class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> outer =new ArrayList<>();
        Arrays.sort(candidates);
        com(0 ,candidates,target,outer , new ArrayList<>() );
        return outer;
    }
    public void com(int start , int[] arr , int tar , List<List<Integer>> outer , List<Integer> list ){
         if(tar==0){
            outer.add(new ArrayList<>(list));
            return ;
         }
         
         for(int i=start ; i< arr.length ; i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            if(arr[i]>tar) break;
            list.add(arr[i]);
            com(i+1, arr , tar-arr[i], outer ,list);
            list.remove(list.size()-1);
         }
    }
}