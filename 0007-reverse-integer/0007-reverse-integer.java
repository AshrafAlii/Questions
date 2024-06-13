class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int digit = x%10;
            int newRes = rev * 10 + digit;
            if((newRes - digit)/10 != rev) return 0;
            rev = newRes;
            x /= 10;
        }
        return rev;
    }
}