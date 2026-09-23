class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int o:nums)
        sum+=o;
        int target = sum-x;
        if(target<0){
            return -1;
        }

        int l=0,ans=0,maxlen=-1;
        for(int r=0;r<nums.length;r++){
            ans+=nums[r];
            while(ans>target){
                ans-=nums[l];
                l++;
            }
            if(ans==target)
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen==-1?-1:nums.length-maxlen;
    }
}