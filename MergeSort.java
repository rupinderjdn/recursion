package recursion;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {5,7,12,9,1};
		display(a,a.length);
		merge_sort(a,0,a.length-1);
		display(a,a.length);
	}
	private static void merge_sort(int[] a,int s,int e) {
		if(s<e) {
			int m=(s+e)/2;
			merge_sort(a,s,m);
			merge_sort(a,m+1,e);
			merge(a,s,m,e);
		}
	}
	private static void merge(int[] a,int s,int m,int e) {
		int i=s,j=m+1,k=s;
		int[] b=new int[e+1];
		while(i<=m && j<=e) {
			if(a[i]<=a[j]) {
				b[k++]=a[i++];
			}
			else {
				b[k++]=a[j++];
			}
		}
		for(;i<=m;i++)b[k++]=a[i];
		for(;j<=e;j++)b[k++]=a[j];
		for(i=s;i<=e;i++)a[i]=b[i];
	}
	private static void display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
}
