import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();
		int input = sc.nextInt();
		int result = 0;
		
		for(int i=input; i<=password; i++) {
			result += 1;
		}
		System.out.println(result);
	}
}
