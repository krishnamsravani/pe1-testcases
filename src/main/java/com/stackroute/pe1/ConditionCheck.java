package com.stackroute.pe1;

public class Program2
{
    public static String conditionalChecker(int num)
    {
        String str;

        if(num>=20 && num<=30)
        {
            if(num%2!=0)
            {
                System.out.println("Tom");
                str="Tom";


            }
            else{
                System.out.println("Jerry");
                str="Jerry";
            }


        }
        else{
            System.out.println("neither Tom nor Jerry");
            str="neither Tom nor Jerry";
        }
        return str;
    }
}
