class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        double ans=0.0d;
        int[] arr=new int[nums1.length+nums2.length];
        while(j<nums1.length && k<nums2.length){
            if(nums1[j]<=nums2[k]){
                arr[i++]=nums1[j++];
            }
            else{
                arr[i++]=nums2[k++];
            }
        }
        while(j<nums1.length ){
             arr[i++]=nums1[j++];
        }
        while(k<nums2.length ){
             arr[i++]=nums2[k++];
        }
        if(arr.length%2!=0){
            int midIndex=arr.length/2;
            ans = arr[midIndex];
        }
        else{
        int mid=arr.length/2;
        int midplus=(arr.length-1)/2;
        ans=(arr[mid]+arr[midplus])/2.0;
        }
        return ans;
    }
}