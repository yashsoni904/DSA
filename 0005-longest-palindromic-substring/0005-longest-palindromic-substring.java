class Solution {
    public String longestPalindrome(String s) {
         int n= s.length();
         int max=0;
         String lS="";
         for(int i=0;i<n; i++){
               
             for(int j=i;j<n;j++){

                 
                 if(isPalin(s.substring(i,j+1))){
                    String c=s.substring(i,j+1);
                    int len =c.length();
                    if(len>max){
                        max=len;
                        lS=s.substring(i,j+1);
                    }
                 }
                 

             }
         } 
         return lS;
    }
    public boolean isPalin(String s){
        int f=0;
        int e=s.length()-1;
        while(f<e){
            if(s.charAt(f)!=s.charAt(e)){
                return false;
            }
            else{
                f++;
                e--;
            }
        }
        return true;
    }
}