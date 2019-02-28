package com.stackroute;

import java.util.Scanner;

public class Ques2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resultNumInt = (int)Math.log(num)/(int)Math.log(4);
        Double resultNumDouble = Math.log(num)/Math.log(4);
        if(resultNumInt == resultNumDouble)
        {
            System.out.println("Number is power of 4");
        }
        else
        {
            System.out.println("Number is not a power of 4");
        }
    }
}
