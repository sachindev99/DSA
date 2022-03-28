package Hashing;

public class Anangram {
    public static void main(String[] args) {
        String str1="geek";
        String str2="keeg";
        if(str1.length()!=str2.length())
        {
            System.out.println("Not an anagram");
        }
        else
        {
            checkIfAnagram(str1,str2);  
        }
    }

    private static void checkIfAnagram(String str1, String str2) {
        char [] ch = new char[256];

        for(int i=0;i<str1.length();i++)
        {
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }

        boolean flag=false;

        for(int i=0;i<256;i++)
        {
            if(ch[i]!=0)
            {
                System.out.println("Not an anagram");
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Anagram");
        }

        
    }
   
}
