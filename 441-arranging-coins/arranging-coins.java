class Solution {
    public int arrangeCoins(int n) {
        int max=0;
        int low=0,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            long k=1L*mid*(mid+1)/2;
            if(k<=n)
            {
                max=mid;
                low=mid+1;
            }
            else if(k>n){
                high = mid-1;
            }

        }
    return max;
    }
}