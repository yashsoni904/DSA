class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<numRows;i++){
           ArrayList<Integer> list = new ArrayList<>();
           int j=0;
           while(j<=i){
                if(j==0 || j==i){
                  list.add(1);
                }else{
                int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                list.add(val);
                }
                j++;
                
           }
           ans.add(list);
        }
        return ans;
    }
}