class Solution {
    public int maxDistinct(String s) {
        int[] count=new int[26];
        int cnt=0;
        for(int i=0;i<s.length();i++){
             count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0) cnt++;
        }
        return cnt;
    }
}