class Solution {
    public boolean isPalindrome(String s) {

        int left = 0; int right = s.length() -1;
        
        while(left < right) {
            if(! Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            if(! Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
            }
        return true;
    }
}

/*
    while (sleft.isLoD != True) {left++;}
    while (sright.isLoD !=True) {right--;}
    
    if(sleft.LC != sright.LC) {
        return false;
    }
    left++;
    right--;
    }
    
    return true
    
*/