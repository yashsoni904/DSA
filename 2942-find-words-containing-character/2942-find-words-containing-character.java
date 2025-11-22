class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list =new ArrayList<>();
        for(int j=0;j<words.length;j++){
            String s=words[j];
            int i=0;
            while(i<s.length()){
                if(s.charAt(i)==x){
                   list.add(j);
                   break;
                }
                i++;
            }
        }
        return list;
    }
}