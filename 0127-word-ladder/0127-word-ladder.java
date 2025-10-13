class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //if wordList does not contains the endWord so return 0
         Set<String> wordSet =new HashSet<>(wordList);
        if(!wordList.contains(endWord)) return 0;

        Set<String> set =new HashSet<>();
        Queue<String> q =new LinkedList<>();
        int len=1;
        q.offer(beginWord);
        set.add(beginWord);

        while(!q.isEmpty()){
            int size=q.size();
           
            
            for(int i=0;i<size;i++){
                String curr=q.poll();
                for(int j=0 ; j<curr.length();j++){
                    char[] temp=curr.toCharArray(); 
                    for(char c='a'; c<='z'; c++){
                       temp[j]=c;
                       String newWord= new String(temp);
                       if(newWord.equals(endWord)){
                        return len+1;
                       }
                       if(wordSet.contains(newWord) && !set.contains(newWord)){
                           q.offer(newWord);
                           set.add(newWord);
                       }
                    }
                }
            }
            len++;
        }
        return 0;
    }
}