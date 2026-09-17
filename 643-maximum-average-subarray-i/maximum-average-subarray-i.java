class Solution {
    private double average(int []nums,int start,int end){
        int sum=0,d=0;
        for(int i=start;i<=end;i++){
            sum+=nums[i];
            d++;
        }
        return 1.0*sum/d;
    }

    public double findMaxAverage(int[] nums, int k) {
        double mAvg=-Double.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            double avg;
            avg=average(nums,i,i+k-1);
            mAvg=avg>mAvg?avg:mAvg;
        }
        return mAvg;
    }
}