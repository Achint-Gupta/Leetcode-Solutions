class Solution {
    public int reverseDegree(String s) {
        int ans=0;
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ans+=26*(i+1);
            }
            else if(s.charAt(i)=='a'+1){
                ans+=25*(i+1);
            }
            else if(s.charAt(i)=='a'+2){
                ans+=24*(i+1);
            }
            else if(s.charAt(i)=='a'+3){
                ans+=23*(i+1);
            }
            else if(s.charAt(i)=='a'+4){
                ans+=22*(i+1);
            }
            else if(s.charAt(i)=='a'+5){
                ans+=21*(i+1);
            }
            else if(s.charAt(i)=='a'+6){
                ans+=20*(i+1);
            }
            else if(s.charAt(i)=='a'+7){
                ans+=19*(i+1);
            }
            else if(s.charAt(i)=='a'+8){
                ans+=18*(i+1);
            }
            else if(s.charAt(i)=='a'+9){
                ans+=17*(i+1);
            }
            else if(s.charAt(i)=='a'+10){
                ans+=16*(i+1);
            }
            else if(s.charAt(i)=='a'+11){
                ans+=15*(i+1);
            }
            else if(s.charAt(i)=='a'+12){
                ans+=14*(i+1);
            }
            else if(s.charAt(i)=='a'+13){
                ans+=13*(i+1);
            }
            else if(s.charAt(i)=='a'+14){
                ans+=12*(i+1);
            }
            else if(s.charAt(i)=='a'+15){
                ans+=11*(i+1);
            }
            else if(s.charAt(i)=='a'+16){
                ans+=10*(i+1);
            }
            else if(s.charAt(i)=='a'+17){
                ans+=9*(i+1);
            }
            else if(s.charAt(i)=='a'+18){
                ans+=8*(i+1);
            }
            else if(s.charAt(i)=='a'+19){
                ans+=7*(i+1);
            }
            else if(s.charAt(i)=='a'+20){
                ans+=6*(i+1);
            }
            else if(s.charAt(i)=='a'+21){
                ans+=5*(i+1);
            }
            else if(s.charAt(i)=='a'+22){
                ans+=4*(i+1);
            }
            else if(s.charAt(i)=='a'+23){
                ans+=3*(i+1);
            }
            else if(s.charAt(i)=='a'+24){
                ans+=2*(i+1);
            }
            else if(s.charAt(i)=='a'+25){
                ans+=(i+1);
            }
       }
       return ans;
    }
}