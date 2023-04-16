class Solution {
    public int removeDuplicates(int[] nums) {
//         int index = 1;
//         int count = 0;
        
//         for (int i =1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]) {
//                 count++;
                
//             }else{
//                 count = 0;
        
//             }
//             if(count <=1) {
//                 nums[index]= nums[i];
//                 index++;
                
//             }
//         }
//         return index;
        if(nums.length ==1) return 1;

        int count = 2;

        for(int i = 2;i< nums.length;i++) {
            if(nums[count-2] < nums[i]) {
                nums[count++] = nums[i];
                
            }
        }
        return count;
    }
}


