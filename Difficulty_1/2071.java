import java.util.Scanner;
import java.math.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] arr = new int[10];
		
		for(int i=1; i<=T; i++) {
			int total = 0;
			double average = 0;
			
			for(int j=0; j<10; j++) {
				arr[i]=sc.nextInt();
				total += arr[i];
			}
			average = (double)total/10;
			System.out.println("#"+i+" "+Math.round(average));
		}
	}
}
