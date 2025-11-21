class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(n<k) return -1;
        int suml=0;
        int sumr=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            suml+=cardPoints[i];
            // sumr+=cardPoints[n-1-i];
        }
        maxsum=suml;
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            suml=suml-cardPoints[i];
            sumr+=cardPoints[rindex];
            rindex--;
            maxsum=Math.max(maxsum,suml+sumr);

        }
      
        return maxsum;
    }
}