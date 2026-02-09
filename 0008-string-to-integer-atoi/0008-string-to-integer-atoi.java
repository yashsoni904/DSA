class Solution {
    public int myAtoi(String s) {
      
       return helper(s, 0 ,1,false);
    }
    public int helper(String s,long n ,int sign,boolean started){
        if(s.isEmpty()) return (int)n*sign;

        char ch=s.charAt(0);
      
        if(ch==' ' && !started){
          return helper(s.substring(1),n , sign,started);
        }

        if((ch=='-' || ch=='+' )&&  !started){
            return helper(s.substring(1),n , (ch=='-')?-1:1, started);
        }

        if(Character.isDigit(ch)){
            started=true;
            int digit=ch-'0';
            //Will n * 10 + digit > Integer.MAX_VALUE ?
            //n > (Integer.MAX_VALUE - digit) / 10
            if(n>(Integer.MAX_VALUE-digit)/10){
               return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            n=n*10+digit;
            
            return helper(s.substring(1),n , sign,started);
        }
        return (int)n*sign;
    }
}