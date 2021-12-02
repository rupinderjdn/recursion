package recursion;

public class count_zeroes {

	public static void main(String[] args) {
		int n=10030020;
		System.out.print(count_zeroes(n));
	}
	public static int count_zeroes(int n) {
		if(n%10==n) {
			return 0;
		}
		if(n%10==0) {
			return 1+count_zeroes(n/10);
		}
		else {
			return count_zeroes(n/10);
		}
	}

}
