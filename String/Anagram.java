package String;

public class Anagram {
    public static void main(String[] args) {
        String str1="aabca";
        String str2="abcaa";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length())
        {
            return false;
        }

        int[] count = new int[256];
        // we are counting the frequencies of both the string
        // increment the count for String 1
        // decrement the count for String 2
        // if the frequencies of characters match in both the Strings then there is an anagram
        for(int i=0;i<str1.length();i++)
        {
            count[str1.charAt(i)]=count[str1.charAt(i)]+1;
            count[str2.charAt(i)]=count[str2.charAt(i)]-1;
        }

        //if the count is same for all the characters then, the count at every index of count[] should be zero

        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}
