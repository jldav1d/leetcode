class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n: nums){

            // exploit XOR property
            // e.g. a ^ b ^ a ^ b ^ c
            // c 'gets filtered out'
            result ^= n;
        }

        return result;
        
    }
}