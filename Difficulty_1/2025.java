import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int total = 0;
		
		for(int i=1; i<=T; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
