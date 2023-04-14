class Solution {
    public boolean isPalindrome(String s) {
        // String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z]";

        s = s.replaceAll(match, "");  //O(n)
        s = s.toLowerCase();  //O(n)
        
        String n = "";
        
        for (int i = s.length() - 1; i >= 0;i--) {  //O(n)
            n = n + s.charAt(i);
        }
        System.out.println(s);
        System.out.println(n);
        
        boolean ans = (s.equals(n)) ? true : false;  //O(n)
        return ans;
    }
}