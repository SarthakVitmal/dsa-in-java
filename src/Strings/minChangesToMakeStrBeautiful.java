package Strings;

public class minChangesToMakeStrBeautiful {
    public static void main(String[] args) {
        String s = "1001";
        int res = minChanges(s);
        System.out.println(res);
    }

    private static int minChanges(String s) {
        int min = 0;
        for (int i = 0; i < s.length()-1; i+=1) {
            if(s.charAt(i) != s.charAt(i+1)){
                min++;
            }
        }
        return min;
    }
}
