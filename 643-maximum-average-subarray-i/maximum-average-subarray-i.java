class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cs=0,ms;
        int n=nums.length;
        for(int i=0;i<k;i++){
            cs+=nums[i];
        }
        ms=cs;
        for(int i=k;i<n;i++){
            cs+=nums[i];
            cs-=nums[i-k];
            ms=Math.max(ms,cs);
        }
        return ms/k;
    }
}