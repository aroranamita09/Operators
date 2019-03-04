package com.stackroute;

import java.util.Scanner;

public class PowerOf4 {
    public int checkPowerOf4(int num)
    {
        
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
        return resultNumInt;
    }
}
