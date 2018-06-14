package Assignment8;

import java.util.Scanner;

class String_Reverse
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        sc.close();
        StringBuffer input1 = new StringBuffer();
         input1.append(str);
         input1 = input1.reverse();
        System.out.println(input1);
    }
}