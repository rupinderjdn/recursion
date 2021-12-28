package recursion;
import java.util.*;
import java.io.*;
public class Nqueens {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] chess=new int[n][n];
		printqueens(chess,0,n);
	}
	private static void printqueens(int[][] chess,int row,int n) {
		if(row==n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(chess[i][j]+" ");
				}
				System.out.println("");
			}
			return ;
		}
		for(int col=0;col<n;col++) {
			chess[row][col]=1;
			printqueens(chess,row+1,n);
			chess[row][col]=0;
		}
	}

}
