class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
        unordered_map<int,int>mp;
        int count=0;
      for(auto n:time){
        int rem=n%60;
        int complement=(60-rem)%60;
        count+=mp[complement];
        mp[rem]++;
      }
      return count;
    }
};