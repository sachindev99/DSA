package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

//implementation of chaining
public class Chaining {
    public static void main(String[] args) {
        MyHash mh= new MyHash(7);
        mh.insert(10);
        mh.insert(15);
        System.out.println(mh.search(10));
        mh.delete(10);
        System.out.println(mh.search(10));

        for (int i = 0; i < 7; i++) {
            System.out.print(mh);
            
        }
    }
    
}
class MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> al;
    //constructor
    MyHash(int b)
    {
        BUCKET=b;
        al=new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            al.add(new LinkedList<Integer>());
            
        }
    }


    void insert(Integer k)
    {
        int i =k%BUCKET;
        al.get(i).add(k);
    }

    boolean search(Integer k)
    {
        int i=k%BUCKET;
        return al.get(i).contains(k);
    }

    void delete(Integer k)
    {
        int i=k%BUCKET;
        al.get(i).remove(k);
    }
    
}
