import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int[] month = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int num = sc.nextInt();
		int date = 0;
		
		int y = 0;
		int m = 0;
		int d = 0;
		
		for(int i=1; i<=num; i++) {
			date = sc.nextInt();
			
			y = date/10000;
			m = date%10000/100;
			d = date%100;
			
			if(d > day[m] || day[m]<=0) {
				System.out.println("#" + i + " " + -1);
			} 
			else
				System.out.println("#" + i + " " + String.format("%04d", y) + "/" + String.format("%02d", m) + "/" + String.format("%02d", d));
			
		}
	}
}
