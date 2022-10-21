import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
			Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int hour = h1+h2;
			int minute = m1+m2;
			
			if (minute>=60) {
				hour = hour + minute/60;
				minute %= 60;
			}
			
			if (hour%12 == 0) {
				hour = 12;
			} else if(hour>12) {
				hour %= 12;
			}
			System.out.println("#" + i + " " + hour + " " + minute);
		}
	}
}
