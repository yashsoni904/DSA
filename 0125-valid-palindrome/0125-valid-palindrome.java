class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int f=0;
        int l=str.length()-1;
        while(f<=l){
            if(str.charAt(f++)!=str.charAt(l--)) return false;
        }
        return true;
    }
}