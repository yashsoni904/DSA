

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        
        // Store jewels in a set for O(1) lookup
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }

        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
