class Solution {
public:
    int findMin(vector<int>& nums) {
        int l=0,r=nums.size()-1,Min=INT_MAX;
        while(l<=r){
           int mid=(l+r)/2;
           if(nums[l]<=nums[mid]){
            Min=min(nums[l],Min);
            l=mid+1;
           }
           else{
            Min=min(nums[mid],Min);
            r=mid-1;
           }
            }
        return Min;
        }    
            
    };
