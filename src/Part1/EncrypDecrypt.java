package Part1;

import java.util.Scanner;



public class EncrypDecrypt {
	public static void main(String[] args) {
		 Scanner word= new Scanner(System.in); 
		 System.out.println("please enter what you want to encrypt> ");
		 String data = word.nextLine();
		 
		 char[] encrypt= data.toCharArray();
		 String e="";
		 
		for(char c:encrypt )
		{
			c+=9;	
			e=e+c;
		}
		 System.out.println("the encryption of "+data);
		 System.out.println(y);
		 System.out.println("the original word>");
		 char[] decrypt= y.toCharArray();
		 String d="";
		for(char c:decrypt )
		{
			c-=9;	
			d=d+c;
		}
		System.out.println(d);
	}

}


