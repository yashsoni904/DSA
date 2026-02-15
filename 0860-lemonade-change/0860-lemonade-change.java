class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] freq =new int[3];
        for(int num : bills){
            if(num==5){
                freq[0]++;
            }
            else if(num==10){
                if(freq[0]>0){
                    freq[0]--;
                    
                }
                else return false;
                freq[1]++;
            }
            else{
              if(freq[0]>=1 && freq[1]>=1) {
                freq[0]--;
                freq[1]--;
              }
              else if(freq[0]>=3 && freq[1]==0){
                freq[0]=freq[0]-3;
              }
              else return false;
              freq[2]++;
            }
        }
        return true;
    }
}