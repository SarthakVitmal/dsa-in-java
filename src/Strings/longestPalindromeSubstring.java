package Strings;

public class longestPalindromeSubstring {
    public static String longestPalindrome(String s){
        StringBuilder sb;
        StringBuilder ans = new StringBuilder();
        int n = s.length() - 1;
        int i = 0; int j = n;
        int maxLen = 0;
        if(s.length() == 1)return s;
        while (i < j){
            int length = 0;
            sb = new StringBuilder();
            for (int k = i; k <= j; k++) {
                sb.append(s.charAt(k));
                length++;
            }
            if(sb.toString().contentEquals(sb.reverse())){
                maxLen = Math.max(length,maxLen);
                System.out.println(ans);
                ans = sb;
            }
            i++;
            j--;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "ac";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
