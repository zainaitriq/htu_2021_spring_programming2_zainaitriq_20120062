package Part1;

import java.util.Scanner;



public class EncrypDecrypt {
	public static void main(String[] args) {
		 Scanner word= new Scanner(System.in); 
		 System.out.println("please enter what you want to encrypt> ");
		 String data = word.nextLine();
		 
		 char[] encrypt= data.toCharArray();
		 String y="";
		 
		for(char c:encrypt )
		{
			c+=9;	
			y=y+c;
		}
		 System.out.println("the encryption of "+data);
		 System.out.println(y);
		 System.out.println("the original word>");
		 char[] decrypt= y.toCharArray();
		 String x="";
		for(char c:decrypt )
		{
			c-=9;	
			x=x+c;
		}
		System.out.println(x);
	}

}


