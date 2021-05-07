package com.company;
public class VarArgs{
     static int add(int x,int...arr)//here we are using the concept of varargs metod
    {
//        int []arr=new int[];
        int result=0;
        for(int elements:arr)
        {
            result=result+elements;

        }
        return  result;
    }
//    static int add(int a,int b,int c)
//    {
//        int d=a+b;
//        return d;
//    }
    public static void main(String[] args) {
        System.out.println(add(12,0));
       int n= add(2,3,4);
        System.out.println(n);
//        int re=add(1,2,3);
//        System.out.println(re);


    }

}
