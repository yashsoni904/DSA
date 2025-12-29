class Solution {
    public int maxFreqSum(String s) {
        int vo =0;
        int cos =0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']++;
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ){
                if(vo < freq[c-'a'] ) vo=freq[c-'a'];
            }
            else{
                if(cos < freq[c-'a'] ) cos=freq[c-'a'];
            }
        }
        return vo+cos;
    }
}