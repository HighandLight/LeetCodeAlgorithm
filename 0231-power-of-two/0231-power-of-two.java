class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n %2 == 0){
            int ans = n / 2;
            return isPowerOfTwo(ans);
        }else {
            return false;
        }
        
    }
}