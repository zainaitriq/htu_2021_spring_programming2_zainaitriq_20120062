package part3;

import java.util.Scanner;

public class CalculateGpa {
	public static void main(String[] args) {
		//d=3.6-4 // m= 2.8-3.59 // p=2.4-2.79 
		 Scanner subnum= new Scanner(System.in); 
		 System.out.println("please enter the number of your courses in p m d > ");
		 int num = subnum.nextInt();
		 Scanner M= new Scanner(System.in); 
		 System.out.println("please enter your marks> ");
		 String marks = M.nextLine();
		 Scanner hrsnum= new Scanner(System.in); 
		 System.out.println("please enter the number of the hours to each coure in the order of the marks you entered > ");
		 String hrs = hrsnum.nextLine();
		 int HRS[]= new int [hrs.length()];
		 for (int i = 0; i < hrs.length(); i++) {
				HRS[i] = Character.digit(hrs.charAt(i), 10);
			}
		 
		 char[] Marks=marks.toCharArray();
		 double AvgD=0,AvgM=0,AvgP=0;
		 double d=0,m=0,p=0;
		 for (int i=0; i<=num ; i++)
		 {
			 if(Marks[i]=='d' || Marks[i]=='D')
			 {
				 d=4.0*HRS[i];
				 AvgD=AvgD+d;
			 }
			 else if (Marks[i]=='p' || Marks[i]=='P') {
				p=2.4*HRS[i]; 
				AvgP=AvgP+p;
			 }
			 else if (Marks[i]=='m' || Marks[i]=='M') {
				 m=3.2*HRS[i];
				 AvgM=AvgM+m;
			 }
			 
			 
			 
		 }
		 int SumHrs=0;
		 for(int y=0; y<=num; y++) {
			 SumHrs=SumHrs+HRS[y];
		 }
		 double sumAvg= AvgD+AvgP+AvgM;
		 double GPA= sumAvg/SumHrs;
		
		 if (GPA>=3.6 && GPA<=4)
		 {
			 System.out.println("your GPA is "+GPA +" it is Destinction ");
		 }
		 else if (GPA>=2.8 && GPA<=3.59) {
			 System.out.println("your GPA is "+GPA +" it is Merit ");
		 }
		 else if (GPA>=2.4 && GPA<=2.79) {
			 System.out.println("your GPA is "+GPA +" it is Pass ");
		 }
		 else if (GPA<2.4) {
			 System.out.println("your GPA is "+GPA +" you fail ");
		 }
	}

}
