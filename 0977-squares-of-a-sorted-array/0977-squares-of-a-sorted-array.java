class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        int p = nums.length -1;
        int[] newNums = new int[nums.length];
        
        while(l <= r) {
            if (Math.abs(nums[l]) <= Math.abs(nums[r])) {  //o(1)
                newNums[p] = nums[r] * nums[r];
                r--;
               
            }else {
                newNums[p] = nums[l] * nums[l];
                l++;
                
            }
            p--;
        }
        return newNums;
        
    }
       
}
