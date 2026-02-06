class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans =new ArrayList<>();
        helper(n , ans , new StringBuilder(),0,0);
        return ans;
    }
    public void helper(int n,List<String> ans,StringBuilder sb,int open ,int close){
        if(sb.length() == (n*2)){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            helper(n,ans,sb.append('('),open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            helper(n,ans,sb.append(')'),open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        

        
    }
}