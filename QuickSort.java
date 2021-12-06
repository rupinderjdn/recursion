package recursion;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {5,2, 36,3,4,1};
		display(a,a.length);
		quick_sort(a,0,a.length-1);
		display(a,a.length);
	}
	private static int partition(int a[],int s,int e) {
		int pivot=a[s];
		int i=s+1,j=e;
		do {
			while(a[i]<=pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}while(i<j);
		int temp=a[s];
		a[s]=a[j];
		a[j]=temp;
		return j;
	}
	private static void quick_sort(int[] a,int s,int e) {
		if(s<e) {
			int j=partition(a,s,e);
			quick_sort(a,s,j);
			quick_sort(a,j+1,e);
		}
	}
	private static void display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}

}
