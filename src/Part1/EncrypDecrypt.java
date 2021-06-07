package Part1;

import java.util.Scanner;



public class EncrypDecrypt {
	public static void main(String[] args) {
		 Scanner word= new Scanner(System.in); 
		 System.out.println("please enter what you want to encrypt> ");
		 String data = word.nextLine();
		 Encryption Encrypt = new Encryption();
		 String encrypt=Encrypt.Encrypt(data);
		 System.out.println(encrypt); 
	     System.out.println("the original word>");
		 Decryption Dec = new Decryption();
		 System.out.println(Dec.Decrypt(encrypt));
	}

}

