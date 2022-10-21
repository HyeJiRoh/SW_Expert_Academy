import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] input = new int[10];
		
		for(int i=1; i<=num; i++) {
			float total = 0f;
			for(int j=0; j<10; j++) {
				input[j] = sc.nextInt();
			}
			Arrays.sort(input);
			for(int k=1; k<9; k++) {
				total += input[k];
			}
			System.out.printf("#%d %.0f \n", i, total/8);
		}
	}
}
