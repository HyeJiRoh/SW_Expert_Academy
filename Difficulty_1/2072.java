import java.util.Scanner;
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
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
				if(arr[j]%2 != 0) {
					total += arr[j];
				}
			}	
			System.out.println("#"+ i + " " + total);
		}
	}
}
