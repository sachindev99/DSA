package String;

public class RabinKarp {
    public static void main(String[] args) {
        String s="GEEKS FOR GEEKS";
        String pattern="GEEK";
        pattern(s,pattern);
    }

    public static void pattern(String s,String pattern)
    {
        int M=s.length();
        int N=pattern.length();
        int pHash=0;
        int sHash=0;
        // calculate the hash of pattern
        for(int i=0;i<pattern.length();i++)
        {
            pHash+=pattern.charAt(i);
        }
        // calculate the hash of the first window of size pattern of string  eg. "GEEK"
        for(int i=0;i<pattern.length();i++)
        {
            sHash+=s.charAt(i);
        }

        for(int i=0;i<M-N;i++)
        {
            // compare the hash values of pattern and string
            if(pHash==sHash)
            {
                // if the hash values match enter into the loop to check if they are really equal
                // god and dog have the same hash value, that's why we have to be more precise
                int j=0;
                for(j=0;j<N;j++)
                {
                    if(pattern.charAt(j)!=s.charAt(i+j))
                    {
                        break;
                    }
                }
                // if the pattern matches print result

                if(j==N)
                {
                    System.out.println("Pattern found at index "+i);
                }
            }
            // if not, then remove the hash value of first charcter and add the hash value of the next character
            // for eg, String s="abacde" and String pattern="abc"
            // since, hash value of aba and abc does'nt match remove the hash value of a and add the hash value of d

            if(i<M-N)
            {
                sHash=sHash-s.charAt(i)+s.charAt(i+N);
            }
        }
        
        
    }
}
