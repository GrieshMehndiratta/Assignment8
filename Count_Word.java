package Assignment8;

import java.util.Scanner;

public class Count_Word {

	static int Count(String str)
	{
	
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		count++;
		return count;
	}
	
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int count;
		count=Count(str);
		System.out.println(count);
		sc.close();

	}

}
