import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int total = 0;
			int average = 0;
			int test = sc.nextInt();

			int[] income = new int[test];
			
			for(int k=0; k<test; k++) {
				income[k] = sc.nextInt();
				total += income[k];
			}
			average = total/test;
			
			int count = 0;
			
			for(int j=0; j<test; j++) {
				if(income[j]<=average) {
					count++;
				}
			}
			System.out.printf("#%d %d\n", i, count);
		}
	}
}
