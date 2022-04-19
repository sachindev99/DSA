package String;
//recurive solution
public class SubSequenceRec {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="rfg";
        System.out.println(isSubsequence(str1,str2,str1.length(),str2.length()));
    }

    private static boolean isSubsequence(String str1, String str2, int i, int j) {
        // if j reaches to 0 then it means there is subsequence
        // if i reaches to 0 but j does not reaches to 0 that means there is no subsequence

        if(j==0)
        {
            return true;
        }
        if(i==0)
        {
            return false;
        }

        if(str1.charAt(i-1)==str2.charAt(j-1))
        {
            return isSubsequence(str1, str2, i-1, j-1);
        }

        else
        {
            return isSubsequence(str1, str2, i-1, j);
        }

    }
}
