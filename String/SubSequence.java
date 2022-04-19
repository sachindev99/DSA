package String;

public class SubSequence {
   public static void main(String[] args) {
       String str1="abcde";
       String str2="ad";
       System.out.println(isSubsequence(str1,str2));
       
   }

private static boolean isSubsequence(String str1, String str2) {
    int i=0;
    int j=0;
    
    while(i<str1.length()&&j<str2.length())
    {
        if(str1.charAt(i)==str2.charAt(j))
        {
            i++;
            j++;
        }

        else
        {
            i++;
        }
    }

    if(j==str2.length())
    {
        return true;
    }

    return false;

} 
}
