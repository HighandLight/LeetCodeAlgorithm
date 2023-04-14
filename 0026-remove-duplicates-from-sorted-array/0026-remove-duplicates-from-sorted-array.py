class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        # new_nums = []

        
        # for i in nums:   #o(n)
        #     if i != new_nums[-1]:  #o(n)
        #         new_nums.append(i)
        # return len(new_nums)

        #o(n^2)

        # print(len(x))
        # index = 0
        # new_nums = nums
        # while index < len(new_nums):
        #     if nums[index] == nums[index +1]:
        #     index += 1

        pointer = 0
        for num in nums:  # usually i is index
            if num != nums[pointer]:
                pointer += 1
                nums[pointer] = num
                # pointer += 1 #1
        return pointer + 1

            
