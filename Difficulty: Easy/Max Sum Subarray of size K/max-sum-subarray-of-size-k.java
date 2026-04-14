class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int cur = 0;
        for(int i=0;i<k;i++){
            cur+=arr[i];
        }
        
        int max = cur;
        
        for(int i=1;i<=n-k;i++){
            cur = cur - arr[i-1] + arr[i+k-1];
            max = Math.max(cur,max);
        }
        
        return max;
        
    }
}