import java.util.*;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = 0;

		System.out.println("N : "+N);
		
		for(int i=0; i<5; i++) {
			total += N%10;
			N = N/10;
			System.out.println("new N : "+N);
			System.out.println("total : "+total);
		}
		System.out.println(total);
	}
}
