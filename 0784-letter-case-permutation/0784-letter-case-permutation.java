class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans =new ArrayList<>();
        helper(s , 0 , ans , "");
        return ans;
    }
    public void helper(String s , int i ,List<String> ans ,String curr ){
        if(i==s.length()){
            ans.add(curr);
            return;
        }
        char c=s.charAt(i);
        if(Character.isDigit(c)){
            helper(s,i+1,ans,curr+s.charAt(i));
        }
        if(Character.isLowerCase(c)){
            helper(s,i+1,ans,curr+c);
            helper(s,i+1,ans,curr+Character.toUpperCase(c));
        }
         if(Character.isUpperCase(c)){
            helper(s,i+1,ans,curr+c);
            helper(s,i+1,ans,curr+Character.toLowerCase(c));
        }
        
    }
}