class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        while(i<haystack.length()){
            int j=0;
            int ans=i;
            if(haystack.charAt(i)==needle.charAt(j)){

                while(i<haystack.length()&&j<needle.length()&&haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                }

                if(j==needle.length()){
                    return ans;
                }
            }
            i=ans+1;
        }
        return -1;
    }
}