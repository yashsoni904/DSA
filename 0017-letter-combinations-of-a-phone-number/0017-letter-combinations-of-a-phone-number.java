class Solution {
    public List<String> letterCombinations(String digits) {
         if(digits.length()==0 || digits==null){
             ArrayList<String> list = new ArrayList<>();
             return list;
         }
         String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
        return helper("",digits,mapping);
    }
    public List<String> helper(String p , String up , String[] mapping){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        String s=mapping[digit];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans.addAll(helper(p+ch , up.substring(1), mapping));
        }
        return ans;
        

    }
}