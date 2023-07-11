class Solution {
    public int climbStairs(int n) {
        
        if(n == 2) return 2;
        if(n == 1) return 1;
        
        int answer = 0;
        int a1 = 1;
        int a2 = 2;
        
        for(int i = 2; i < n; i++){
            answer = a1 + a2;
            a1 = a2;
            a2 = answer;
        }
        return answer;
    
    }
}