package String;

public class ReverseAString {
    public static void main(String[] args) {
        String s="I Love Coding";
        char[] str= s.toCharArray();
        reverseString(str,str.length);
        System.out.println(str);
       
    }

    private static void reverseString(char[] str, int n) {
        //Step 1: reverse the individual words
        int start=0;
        for (int end = 0; end < n; end++) 
        {
            if(str[end]==' ')
            {
                reverse(str,start,end-1);
                start=end+1;
            }
        }

            //for the last word since there is no space after"Coding" we need to handle it explicitly
            reverse(str,start,n-1);
            // Step 2: reverse the whole string
            reverse(str,0,n-1);


    }

    private static void reverse(char[] str, int low, int high) {
        while(low<=high)
        {
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }

    }

    // private static void ReverseString(String s, int n) 
    // {
    //     String[] arrOfStr= s.split(" ");

    //     for(int i=arrOfStr.length-1;i>=0;i--)
    //     {
    //         System.out.print(arrOfStr[i]+" ");
    //     }
    // }
}
