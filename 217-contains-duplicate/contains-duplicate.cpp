class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int>o;
        for(int i=0;i<nums.size();i++){
            
            if(o.find(nums[i])!=o.end())
            return true;
            o[nums[i]]++;
        }
        return false;
    }
};