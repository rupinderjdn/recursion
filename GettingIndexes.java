package recursion;
import java.util.ArrayList;
public class GettingIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,3,4,4,5};
		ArrayList<Integer> list=new ArrayList<>();
		list=getIndex(a,0,4,list);
		//System.out.print(list.isEmpty());
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
	private static ArrayList<Integer> getIndex(int[] a,int index,int target,ArrayList<Integer> list) {
		if(index==a.length) {
			return list;
		}
		//System.out.println(a[index]);
		if(a[index]==target) {
			list.add(index);
		}
		return getIndex(a,index+1,target,list);
	}
	

}
