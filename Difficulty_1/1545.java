import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i=input; i>=0; i--) {
			System.out.print(i + " ");
		}
	}
}
