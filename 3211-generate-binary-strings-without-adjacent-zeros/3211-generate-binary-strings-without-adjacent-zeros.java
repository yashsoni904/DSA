class Solution {
    public List<String> validStrings(int n) {
        List<String> list =new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        
            helper(n,list,sb);
        return list;
    }
    public void helper(int n,List<String> list,StringBuilder sb ){
          if(sb.length()==n){
            list.add(new String(sb));
            return;    
          }

          helper(n , list ,sb.append('1'));
          sb.deleteCharAt(sb.length()-1);

          if(sb.length()==0 || sb.charAt(sb.length()-1)!='0'){
          helper(n , list ,sb.append('0'));
          sb.deleteCharAt(sb.length()-1);
          }
         

    }
}