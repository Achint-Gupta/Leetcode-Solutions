class Solution {
    public boolean validPalindrome(String s) {
        boolean mis = true;
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else if (mis) {
                mis = false;

                int x = i + 1;
                int y = j;

                while (x < y && s.charAt(x) == s.charAt(y)) {
                    x++;
                    y--;
                }

                if (x >= y)
                    return true;

                x = i;
                y = j - 1;

                while (x < y && s.charAt(x) == s.charAt(y)) {
                    x++;
                    y--;
                }

                if (x >= y)
                    return true;

                return false;
            }
            else {
                return false;
            }
        }

        return true;
    }
}