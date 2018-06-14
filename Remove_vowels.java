package Assignment8;

import java.util.Scanner;

class Remove_vowels
{    
    static String Vowel(String str)
    {
         StringBuffer sb = new StringBuffer(str);
         for (int i = 0; i < sb.length(); i++) {
             
             if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'||sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U'){
                sb.replace(i, i+1,"") ;
                i--;
             }
        }    
        return sb.toString();
    }
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();         
        System.out.println(Vowel(str));
    }
}