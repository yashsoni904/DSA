class Solution {
    public String removeStars(String s) {
        Stack<Character> st  =new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='*'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String temp = "";
        while(!st.isEmpty()){
            temp+=st.pop();
        }
        String ans="";
        for(int i=temp.length()-1;i>=0;i--){
            ans+=temp.charAt(i);
        }
        return ans;
    }
}