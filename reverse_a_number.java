package recursion;

public class reverse_a_number {
	public static int m=0;
	public static void main(String[] args) {
		int n=567;
		reverse(n);
		System.out.print(m);
		
	}
	private static void reverse(int n) {
		if(n==0) {
			return ;
		}
		int dig=n%10;
		m=m*10+dig;
		reverse(n/10);
	}

}
