class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        // HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            map.put(c,i);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           sum = sum+Math.abs(i - map.get(c)) ;
        }
        return sum;
    }
}