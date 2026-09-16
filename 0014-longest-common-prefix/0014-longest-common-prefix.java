class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs == null) return "";
        String prefix = strs[0];
        for(String st : strs){
            while(st.indexOf(prefix)!=0){   // jab tak prefix start na ho zero index se tab tak loop chalti rhe gi 
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix=="") return "";
            }
        }
        return prefix;

    }
}