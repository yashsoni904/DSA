class Solution {
    public int maxProduct(int n) {
        int num=n;
        int cnt=0;
        while(num!=0){
            num/=10;
            cnt++;
        }
        int[] arr= new int[cnt];
        int temp=n;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=temp%10;
            temp/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];

    }
}