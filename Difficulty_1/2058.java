import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = 0;

		for(int i=0; i<5; i++) {
			total += N%10;
			N = N/10;
		}
		System.out.println(total);
	}
}
