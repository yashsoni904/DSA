class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans =new int[friends.length];
        int j=0;
        Set<Integer> set = new HashSet<>();
        for(int n:friends) set.add(n);
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
               ans[j++]=order[i];
            }
        }
        return ans;
    }
}