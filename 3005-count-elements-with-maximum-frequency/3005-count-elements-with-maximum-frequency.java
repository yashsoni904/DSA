class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max=0;
        for(int num:nums){
            map.put(num ,  map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        for(int fre : map.values()){
            if(fre==max) sum+=max;
        }
        return sum;

    }
}