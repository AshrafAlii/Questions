class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE / 2;

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    int currSum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(currSum - target) < Math.abs(closestSum - target)){
                        closestSum = currSum;
                    }
                }
            }
        }
        return closestSum;
    }
}