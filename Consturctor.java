package com.company;

class MyEmployee
{
     private int id;
     private String name;

    public  int getid()
    {
        return id;
    }
    public  String getName()
    {
        return name;
    }
    public MyEmployee( String st,int r)
    {
        id=r;
        name=st;
    }
    public MyEmployee(String st)
    {
        name=st;
    }
    public void MyEmployee(int r)
    {
        id=r;
    }

}
public class Consturctor {
    public static void main(String[] args)
    {
        MyEmployee em=new MyEmployee("BILLA BHA");
        System.out.println(em.getName());
        System.out.println(em.getid());



    }
}
