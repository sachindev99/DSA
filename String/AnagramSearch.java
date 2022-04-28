package String;

public class AnagramSearch {
    public static void main(String[] args) {
        String txt="geeksforgeeks";
        String pat="rgeek";
        System.out.println(isAnagram(txt,pat));
    }

    private static boolean isAnagram(String txt, String pat) {
        int res=0;
      for(int i=0;i<txt.length();i++)
      {
         if(txt.charAt(i)==pat.charAt(0))
         {
             res= i;
         }
      }

      String s=txt.substring(res, res+pat.length());
      
      int[] count = new int[256];

      for(int i=0;i<pat.length();i++)
      {
          count[pat.charAt(i)]=count[pat.charAt(i)]+1;
          count[s.charAt(i)]=count[s.charAt(i)]-1;
      }

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
