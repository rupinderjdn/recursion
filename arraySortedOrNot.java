package recursion;

public class arraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1=new int[] {1,2,3,4,5};
		int[] a2=new int[] {1,2,4,3,5};
		System.out.println(check(a1,0));
		System.out.println(check(a2,0));
	}
	public static boolean check(int[] a,int i) {
		if(i==a.length-1) {
			return true;
		}
		return (a[i]<a[i+1]) && check(a,i+1);
	}

}
