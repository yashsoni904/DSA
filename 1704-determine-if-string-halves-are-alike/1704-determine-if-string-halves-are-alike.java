class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set =new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int countA=0,countB=0;
        int half=s.length()/2;
        String a=s.substring(0,half);
        String b=s.substring(half);
        for(int i=0;i<a.length();i++){
            if(set.contains(a.charAt(i))) countA++;
        }
        for(int i=0;i<b.length();i++){
            if(set.contains(b.charAt(i))) countB++;
        }
        return countA==countB;
    }
}