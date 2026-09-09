/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,fo=n;
        while(l<=n){
            int mid=l+(n-l)/2;
            if(isBadVersion(mid)){
                n=mid-1;
                fo=mid;
            }
            else{
                l=mid+1;
            }
        }
        return fo;
    }
}