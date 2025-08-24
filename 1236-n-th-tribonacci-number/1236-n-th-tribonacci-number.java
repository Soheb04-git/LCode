class Solution {
    public int tribonacci(int n) {
        int trib = 0;
        int a = 0, b = 1, c = 1,d;
        if(n == 0  || n == 1) trib = n;
        if(n == 2) trib = 1;
        for(int i = 3; i <= n; i++){
            trib = a + b + c;
            a = b;
            b = c;
            c = trib;
        }
        return trib;
    }
}