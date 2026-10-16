class Solution {
    private boolean isAlnum(char c) {
        return c >= 'A' && c <= 'Z'
            || c >= 'a' && c <= 'z'
            || c >= '0' && c <= '9';
    }

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!isAlnum(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlnum(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}