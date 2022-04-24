package String;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str="abccbd";
        System.out.println(findLeftMostRepeatingCh(str));
    }

    private static int findLeftMostRepeatingCh(String str) {
        int[] count= new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]=count[str.charAt(i)]+1;
        }

        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]>1)
            {
                return i;
            }
        }

        return -1;

    }
}
