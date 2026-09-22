class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            while(i<j&&!Character.isLetter(c[i]))i++;
            while(j>i&&!Character.isLetter(c[j]))j--;
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}