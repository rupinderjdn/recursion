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
			System.out.println("-------");
			return ;
		}
		for(int col=0;col<n;col++) {
			if(safeplace(chess,row,col,n)) {
				chess[row][col]=1;
				printqueens(chess,row+1,n);
				chess[row][col]=0;
			}	
		}
	}
	private static boolean safeplace(int[][] chess,int row,int col,int n) {
		for(int i=row-1, j=col;i>=0;i--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1, j=col-1;i>=0 && j>=0 ;i--,j--) {
			if(chess[i][j]==1)return false;
		}
		
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++) {
			if(chess[i][j]==1)return false;
		}
		return true;
	}

}
