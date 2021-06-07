package Part1;

public class Decryption {
	public String Decrypt(String word) {
		// TODO Auto-generated method stub
     
 char[] decrypt= word.toCharArray();
 String y="";
for(char c:decrypt )
{
	c-=9;	
	y=y+c;
}
	return y;
	}

}
