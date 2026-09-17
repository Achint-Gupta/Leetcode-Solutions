class Solution {

    static {
    for (int i = 0; i < 100; i++) {
        findMaxAverage(new int[1], 1);
    }
}
    public static double findMaxAverage(int[] nums, int k) {
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