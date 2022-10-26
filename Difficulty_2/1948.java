import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int num = sc.nextInt();
		
		int m1 = 0;
		int d1 = 0;
		int m2 = 0;
		int d2 = 0;
		
		int[] result = new int[num+1];
		
		for(int i=1; i<=num; i++) {
			m1 = sc.nextInt();
			d1 = sc.nextInt();
			m2 = sc.nextInt();
			d2 = sc.nextInt();
			
			
			if(m1 == m2) {
				result[i] = d2-d1+1;	
			}
			else {
				for(int j=m1; j<m2-1; j++) {
					result[i] += day[j+1];
				}
				result[i] = result[i] + d2 + (day[m1]-d1+1);
			}
			System.out.println("#" + i + " " + result[i]);
		}
	}
}
