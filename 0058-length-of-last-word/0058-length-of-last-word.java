class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr= s.split(" ");
        String c=arr[arr.length-1];
        return c.length();
    }
}