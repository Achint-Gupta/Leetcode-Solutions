class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxsum=0;
        int currentsum=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                currentsum=0;
                continue;
            }
            currentsum++;
            maxsum=max(maxsum,currentsum);
        }
        return maxsum;
    }
};