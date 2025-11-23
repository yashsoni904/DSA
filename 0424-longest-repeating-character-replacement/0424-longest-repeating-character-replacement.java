class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int l=0;
        int r=0;
        int maxfreq=0;
        int maxlen=0;

        while(r<s.length()){
            count[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq , count[s.charAt(r)-'A']);
            
            while((r-l+1)-maxfreq > k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1 );
            r++;
        }
        return maxlen;
    }
}