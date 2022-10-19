import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int result = 1;
		System.out.print(result + " ");
		
		for(int i=1; i<=input; i++) {
			result *= 2;
			System.out.print(result + " ");
		}
	}
}
