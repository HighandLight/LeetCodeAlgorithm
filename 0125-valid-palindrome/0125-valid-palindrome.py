class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = re.sub('[^a-z0-9]', '', s)
        solution = s[::-1]
        if s == solution:
            return 1 
        else:
            return 0 
        
