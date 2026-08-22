class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i=0,j=nums.size()-1,r=0;
        while(r<=j){
            if(nums[r]==2){
                swap(nums[r],nums[j]);
                j--;
            }
            else if(nums[r]==0){
            swap(nums[r],nums[i]);
            r++;
            i++;
            }
            else
            r++;
        }
    }
};