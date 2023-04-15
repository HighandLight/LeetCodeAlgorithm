class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        int p = nums.length -1;
        int[] new_nums = new int[nums.length];
        
        while(l <= r) {
            if (nums[l] * nums[l] <= nums[r] * nums[r]) {
                new_nums[p] = nums[r] *nums[r];
                r--;
                p--;
            }else {
                new_nums[p] = nums[l] * nums[l];
                l++;
                p--;
            }
        }
        return new_nums;

    }
       
}