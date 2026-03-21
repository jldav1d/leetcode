class Solution {
    public boolean isPalindrome(int x) {
      String num = String.valueOf(x);
      String reversedNum = new StringBuilder(num).reverse().toString();
      return num.equals(reversedNum);  
    }
}