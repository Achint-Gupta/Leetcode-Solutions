class Solution {
public:
    int firstoc(vector<int>& nums, int target){
        int l=0,r=nums.size()-1,firstoc=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                firstoc=mid;
                r=mid-1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return firstoc;
    }
    int lastoc(vector<int>& nums, int target){
        int l=0,r=nums.size()-1,lastoc=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                lastoc=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return lastoc;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        return{firstoc(nums,target),lastoc(nums,target)};
    }
};