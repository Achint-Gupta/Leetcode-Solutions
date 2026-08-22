class Solution {
public:
    int sumd(int n){
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans+=digit;
            n/=10;
        }
        return ans;
    }
    int productd(int n){
         int ans=1;
        while(n>0){
            int digit=n%10;
            ans*=digit;
            n/=10;
        }
        return ans;
    }
    bool checkDivisibility(int n) {
        return n%(sumd(n)+productd(n))==0?true:false;
    }
};