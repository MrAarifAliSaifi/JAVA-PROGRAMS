package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockSeiserPaper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 0 for ROCK"+"\n"+"Please enter 1 for SEISER"+"\n"+"PLease enter 3 for PAPER");
         int userInput=sc.nextInt();
        Random rn=new Random();
        int computerInput=rn.nextInt(3);
        System.out.println(computerInput);
        if (userInput==computerInput)
        {
            System.out.println("DRAW");
        }
        else if(userInput==0&&computerInput==1||userInput==1&&computerInput==2||userInput==2&&computerInput==0)
        {
            System.out.println("YOU WIN!!");

        }
        else{
        System.out.println("You Lose!!!!");
        }
    }
}

