package com.company;
import java.util.Scanner;
class MyEmployee
{
    MyEmployee()
    {
        System.out.println("i am consstructor of parents class wiyh null value ");

    }
    MyEmployee(int x)
    {

        System.out.println("i am a  parents classs constructor with vlaue of:"+x);
    }
    MyEmployee(int x,int y)
    {

        System.out.println("i am a  parents classs constructor with vlaue of:"+x+"and"+y);
    }
}
   class Name extends MyEmployee
        {
            Name()
            {
                System.out.println("i am consstructor of parents class wiyh null value ");

            }
            Name(int x)
            {

                System.out.println("i am a  parents classs constructor with vlaue of:"+x);
            }
            Name(int x,int y,int z)
            {
               super(8,9);
                System.out.println("i am a  child classs constructor with vlaue of:"+x+"and"+y+"and"+z);
            }
        }

  class Consturctor extends Name
    {

        Consturctor()
        {
          super(3,4,5);
            System.out.println("i am grand class consstructor of child class wiyh null value ");

        }
        Consturctor(int x)
        {
            System.out.println("i am a  parents classs constructor with vlaue of:"+x);
        }
        public static void main(String[] args)
        {
           Consturctor con=new Consturctor();

        }

    }
