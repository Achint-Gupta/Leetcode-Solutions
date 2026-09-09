class Solution {
    public int findMin(int[] nums) {
     int l=0,h=nums.length-1,Min=Integer.MAX_VALUE;
     while(l<=h){
        int mid=l+(h-l)/2;
        if(nums[l]<=nums[mid]){
            Min=Math.min(nums[l],Min);
            l=mid+1;
        }
        else{
            Min=Math.min(nums[mid],Min);
            h=mid-1;
        }
     }   
        return Min;
    }
}