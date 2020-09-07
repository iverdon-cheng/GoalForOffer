package palindrome;

public class One {
    //最长回文子串
    String longestPalindrome(String s) {
        String res = s.substring(0,0);
        for (int i=0; i<s.length(); i++){
            String s1 = palindrome(s,i,i);
            String s2 = palindrome(s,i,i+1);
            res = s1.length() >= res.length()?s1:res;
            res = s2.length() >= res.length()?s2:res;
        }
        return res;
    }

    private String palindrome(String s, int l, int r) {
        while (l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        if (r-l == 1){
            return s.substring(l,l);
        }
        return s.substring(l+1,r);
    }

    public static void main(String[] args) {
        String s = "asdfdsa";
        One one = new One();
        System.out.println(one.longestPalindrome(s));
    }
}
