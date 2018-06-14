package Assignment8;

import java.util.Scanner;

class Search_substring
{
  public static void main (String[] args)
  {
	  String str,substr;;
	  Scanner sc=new Scanner(System.in);
	  str=sc.nextLine();
	  substr=sc.nextLine();
	  sc.close();
	  int Index = -1;
	  Index = str.indexOf(substr);
	  if(Index==-1)
		  System.out.println("Not Found");
	  else
		  System.out.println("Found");
  }
}