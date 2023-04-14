class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #two pointer
        
        nums1_max_index = m+n-1
        
        while nums1_max_index >= 0 and n != 0:   #o(n) o(m+n)
            if m == 0 or nums1[m-1] < nums2[n-1]: 
                nums1[nums1_max_index] = nums2[n-1] # 1,2,3,4,5,6
                n -= 1
            else:
                nums1[nums1_max_index] = nums1[m-1]
                # nums2[n-1]
                m -= 1

            nums1_max_index -= 1

            # nums1 = [4, 5, 6, 0, 0, 0]
            # nums2 = [1, 2, 3]

            