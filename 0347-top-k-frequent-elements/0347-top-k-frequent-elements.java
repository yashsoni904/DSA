class Solution {
    public int[] topKFrequent(int[] nums, int k) {  //better approach bukket sort
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq =new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int num=e.getKey() , f = e.getValue();
            pq.offer(new int[]{f,num});
            if(pq.size()>k) pq.poll();
        }

        int ans[] =new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[1];
        }
        return ans;
    }
}