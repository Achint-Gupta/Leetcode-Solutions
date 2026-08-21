class Solution {
public:
    int search(vector<int>& nums, int target) {
        int r=0,l=nums.size()-1;
        while(r<=l){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                l=mid-1;
            }
            else{
                r=mid+1;
            }
        }
        return -1;
    }
};