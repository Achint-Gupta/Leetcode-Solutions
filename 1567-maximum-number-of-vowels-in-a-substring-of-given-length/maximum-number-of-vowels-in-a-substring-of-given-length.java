class Solution {
    public static boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
}   
    public int maxVowels(String s, int k) {
      int n=0,m;
      for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i)))n++;
      }
        m=n;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)))
            n--;
            if(isVowel(s.charAt(i)))
            n++;
            m=Math.max(m,n);
        }
        return m;
    }
}