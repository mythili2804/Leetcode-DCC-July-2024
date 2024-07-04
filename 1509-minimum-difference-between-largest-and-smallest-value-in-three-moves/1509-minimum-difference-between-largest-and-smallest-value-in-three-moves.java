class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
         
        int min = Integer.MAX_VALUE;

        
        for (int left = 0, right = nums.length- 4; left < 4; left++, right++) {
           min = Math.min(min, nums[right] - nums[left]);
        }

        return min;
    }
}