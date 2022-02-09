package Sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a ={10,20,35};
        int[] b={5,50,50};
        int n= a.length;
        int m=b.length;
        int[] temp= new int[m+n];
        merge(a, b, n, m,temp);

        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }

    }

    static void merge(int[] a,int []b,int n ,int m,int [] temp)
    {
        int i=0;
        int j=0;
        int k=0;

        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                temp[k]=a[i];
                i++;
                k++;
            }

            else
            {
                temp[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<n)
        {
            temp[k]=a[i];
            i++;
            k++;
        }

        while(j<m)
        {
            temp[k]=b[j];
            j++;
            k++;
        }

    }
}
