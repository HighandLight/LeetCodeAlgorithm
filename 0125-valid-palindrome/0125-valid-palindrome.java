class Solution {
    public boolean isPalindrome(String s) {
        // String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z]";

        s = s.replaceAll(match, "");
        s = s.toLowerCase();
        
        String n = "";
        
        for (int i = s.length() - 1; i >= 0;i--) {
            n = n + s.charAt(i);
        }
        System.out.println(s);
        System.out.println(n);
        
        boolean ans = (s.equals(n)) ? true : false;
        return ans;
    }
}