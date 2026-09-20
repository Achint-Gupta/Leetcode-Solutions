class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,mw=0;
        while(l<r){
           if(height[l]<=height[r]){
            if(mw<=(r-l)*height[l])
            mw=(r-l)*height[l];
            l++;
           }
           else{
            if(mw<=(r-l)*height[r])
            mw=(r-l)*height[r];
            r--;
           }
        }
         return mw;
    }
}