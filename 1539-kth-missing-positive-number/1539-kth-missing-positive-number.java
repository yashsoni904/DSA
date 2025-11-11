class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        //arr[r]+(k-(arr[r]-(r+1)))
        //arr[r]+k-arr[r]+r+1
        //k+r+1
        //int missing=arr[r]-(r+1); //3 
        return k+r+1;

    }
}