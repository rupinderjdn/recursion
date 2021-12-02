package recursion;
//import java.util.*;
//import java.io.*;
public class checking_palindrome {

	public static void main(String[] args) {
		int n1=1234,n2=1221;
		System.out.println(palin(n1));
		System.out.println(palin(n2));

	}
	public static boolean palin(int n) {
		return n==reverse(n);
	}
	public static int reverse(int n) {
		int digits=(int)(Math.log10(n))+1;
		return helper(n,digits);
	}
	public static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem*(int)Math.pow(10, digits-1)+helper(n/10,digits-1);
	}

}
