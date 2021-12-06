package recursion;

public class PhonePad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pad("23","");
	}
	private static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p+" ");
			return ;
		}
		int digit=up.charAt(0)-'0';
	}
}
