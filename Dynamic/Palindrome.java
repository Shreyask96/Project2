package Dynamic;

import java.util.Scanner;

public class Palindrome {
	static void palin(String str)
	{
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		palin(str);
	}
}
