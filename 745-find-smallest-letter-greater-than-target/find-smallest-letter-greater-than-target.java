class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int l=0,r=letters.length-1,great=0;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(letters[mid]>target){
            great=mid;
            r=mid-1;
        }
        else 
            l=mid+1;
       } 
       return letters[great];
    }
}