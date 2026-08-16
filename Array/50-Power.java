// leetcode 50: Pow(x, n)
// difficulty: medium

class Solution {
    public double myPow(double x, int n) {
//        By using the Built in method--------->
//        double ans = Math.pow(x, n);   
//         return ans;
//        
//        By Not using the Built in method--------->

    class Solution {
    public double myPow(double x, long n) {
        long power=n;

        if(power<0){
            x=1/x;
            power=-power;
        }
        return solve(x,power);
    }
    public double solve(double x,long n){
        if(n==0){
            return 1;
        }
        double half=solve(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    }
}
    }
}
