class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int number = x;
        int rev = 0;
        while(number != 0){
            rev = rev*10 + number%10;
            number /= 10;
        }
        return rev == x;
    }
}