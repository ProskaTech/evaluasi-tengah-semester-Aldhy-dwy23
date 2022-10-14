package com.program;

public class soal1 {
    public static void main(String[]args)
    { 
     for(int i=5/2; i<=5; i+=2)
    {
        for(int j=1; j<=4-i; j+=2)
        {
            System.out.print(" ");
        } 
        for(int j=1; j<=i; j++)
        {
            System.out.print(j+1);
        } 
        for(int j=1; j<=5-i; j++)
        {
            System.out.print(" ");
        } 
        for(int j=1; j<=i; j++)
        {
            System.out.print(j+3);
        } 
        System.out.println();
    }
       

       for(int i=1; i<=5; i++)
       {
           for(int k=1; k<=i-1; k++)
           {
               System.out.print(" ");
           } 
           for(int j=1; j<=2*(5-i+1)-1; j++)
           {
               System.out.print(j);
           } 
           System.out.println();
       }
    }

}
