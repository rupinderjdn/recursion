package recursion;

public class SkipA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bbaccad";
		System.out.println(s);
		String ans="";
		skip_a(s,ans);
	}
	private static void skip_a(String s,String ans) {
		if(s.isEmpty()){
			System.out.println(ans);
			return ;
		}
		char ch=s.charAt(0);
		if(ch=='a') {
			skip_a(s.substring(1),ans);
		}
		else {
			skip_a(s.substring(1),ans+ch);
		}
		
	}

}
