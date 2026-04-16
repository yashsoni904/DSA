class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> chartostr =new HashMap<>();
        HashMap<String, Character> strtochar =new HashMap<>();

        String[] words= s.split("\\s+");

        if(words.length!=pattern.length()) return false;

        for(int i=0;i<pattern.length();i++){

            char c = pattern.charAt(i);
            String word = words[i];

            if(chartostr.containsKey(c)){
                if(!((chartostr.get(c)).equals(word))){
                    return false;
                }
            }
            else{
            chartostr.put(c , word);
            }

            if(strtochar.containsKey(word)){
                if(strtochar.get(word)!=c){
                    return false;
                }
            }
            else{
                strtochar.put(word , c);
            }
        }
        return true;
    }
}