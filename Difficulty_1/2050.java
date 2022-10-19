import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		String text = sc.next();
		
		char[] input = text.toCharArray();
		
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<26; j++) {
				if(input[i]==alphabet[j]) {
					System.out.print(j+1 + " ");
				}
			}
		}
	}
}
