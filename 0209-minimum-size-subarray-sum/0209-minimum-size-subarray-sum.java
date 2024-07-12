class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = nums.length;
        int start = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;
        while(left < right){
            while(start < right && currSum <target){
                currSum = currSum + nums[start];
                start++;
            }
            if(currSum >= target){
                minLen = Math.min(minLen, start-left);
            }
            currSum = currSum - nums[left];
            left++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}