package programming2;

import java.util.Scanner;

public class EncryptionDecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner En= new Scanner(System.in); 
		 System.out.println("please enter what you want to encrypt> ");
		 String data = En.nextLine();
		 Encryption Encrypt = new Encryption();
		 String encrypt=Encrypt.Encrypt(data);
		 System.out.println(encrypt); 
	     System.out.println("the original word>");
		 Decrypt Dec = new Decrypt();
		 System.out.println(Dec.Dec(encrypt));

	}

}
