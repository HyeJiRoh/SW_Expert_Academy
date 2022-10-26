import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int min = sc.nextInt();
			int max = sc.nextInt();
			int total = sc.nextInt();
			
			if(total > max) {
				System.out.printf("#%d %d\n", i, -1);
			} else if(total>=min && total<=max) {
				System.out.printf("#%d %d\n", i, 0);
			} else
				System.out.printf("#%d %d\n", i, min-total);
		}
	}
}
