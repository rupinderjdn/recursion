package recursion;

public class leetCode1823 {
	public static void main(String []args) {
		System.out.print(findTheWinner(5,2));
	}
	public static int findTheWinner(int n, int k) {
        if(n==1)return n;
        int temp=(findTheWinner(n-1,k)+k)%n;
        if(temp==0)temp=n;
        return temp;   
    }
}
