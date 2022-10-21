import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int input = sc.nextInt();
			int total = 0;
			for(int j=1; j<= input; j++) {
				if(j%2 == 0) {
					total -= j;
				} else {
					total += j;
				}
			}
			System.out.println("#"+ i + " " + total);
		}
	}
}
