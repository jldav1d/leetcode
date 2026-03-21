class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int orig = x;
        int reverse = 0;

        // only reverse half the digits
        while(x > 0){

            // extract digit
            int digit = x % 10;
            
            //add placeholder 0 for the next digit
            //and add to reverse
            reverse = (reverse * 10) + digit;

            // move to the next digit of x
            x = (int) Math.floorDiv(x, 10);
        }

        return orig == reverse;
    }
}