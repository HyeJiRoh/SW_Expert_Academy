import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[10];
		
		for(int i=1; i<=T; i++) {
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("#" + i + " " +arr[9]);
		}
	}
}
