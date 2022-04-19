package String;

public class PalindromeEff {
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(isPlaindrome(str));
    }

    private static boolean isPlaindrome(String str) {
        int i=0;
        int j =str.length()-1;

        while(i<j)
        {
            if(str.charAt(i)==(str.charAt(j)))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
