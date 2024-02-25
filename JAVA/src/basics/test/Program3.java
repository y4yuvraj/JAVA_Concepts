package basics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
//		String s1="abaabbc";
		Scanner sc=new Scanner(System.in);
		String s4=sc.nextLine();
		String ans="";
		int count=1;

		char[] sortedChars = s4.toCharArray();
        Arrays.sort(sortedChars);
        String s3 = new String(sortedChars);
		char currentChar=s3.charAt(0);
		for(int i=1;i<s3.length();i++)
		{
			if(s3.charAt(i)==currentChar)
			{
				count++;
			}
			else
			{
				ans=ans+currentChar+count;
				currentChar=s3.charAt(i);
				count=1;
			}
		}
		ans=ans+currentChar+count;
		System.out.println(ans);
	}

}
