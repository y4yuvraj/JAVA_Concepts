package basics.test;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class GFG
{
  
	public static void main (String[] args)
	{
	    //taking input using class Scanner
  	 Scanner sc = new Scanner(System.in);
  	 
  	 //taking total count of all testcases
  	 int t = sc.nextInt();
  	 sc.nextLine();
  	 boolean flag = false;
  	 while(t-- > 0){
  	  
  	  //taking the input String
  	  String s=sc.nextLine();
  	  
  	  //Creating an object of class Geeks
  	  Geeks obj=new Geeks();
  	  
  	  //calling the checkString
  	  //method of class Geeks
  	  obj.checkString(s);
  	   
  	 }
  }
}
//} Driver Code Ends


//User function Template for Java


class Geeks{
  
  static void checkString(String s)
  {
      int v=0;
      int c=0;
      int space=0;
      
      //Your code here
      Pattern pattern=Pattern.compile("[aeiou ]");
      Matcher matcher=pattern.matcher(s);
      
      while (matcher.find()) {
          if(s.charAt(matcher.start())!=' ')
          {
              v++;
          }
          else
          {
              space++;
          }
      }
      c=s.length()-(space+v);
      
      if(v>c)
      System.out.print("Yes");
      else if(c>v)
      System.out.print("No");
      else
     System.out.print("Same");
      
      System.out.println();
  }
}

//Position this line where user code will be pasted.
