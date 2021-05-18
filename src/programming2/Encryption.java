package programming2;

import java.util.Scanner;

public class Encryption {

	public String Encrypt(String word) {
		// TODO Auto-generated method stub
 char[] encrypt= word.toCharArray();
 String y="";
for(char c:encrypt )
{
	c+=9;	
	y=y+c;
}
	return y;
	}
}
