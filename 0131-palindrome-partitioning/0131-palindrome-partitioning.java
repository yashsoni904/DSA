class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans =new ArrayList<>();
        List<String> list =new ArrayList<>();
        helper(s , ans, list , 0);
        return ans;
    }
    public void helper(String s ,List<List<String>> ans , List<String> list,int i){
        if(s.length()==i){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<s.length();j++){
            String temp = s.substring(i, j+1);

            if(palin(temp , 0, temp.length()-1)){
                 list.add(temp);
                 helper(s,ans,list,j+1);
                 list.remove(list.size()-1);
            }
            
        }
    }
    public boolean palin(String s , int l ,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return palin(s,l+1,r-1);
    }


}