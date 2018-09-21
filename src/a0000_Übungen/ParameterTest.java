package a0000_Übungen;

public class ParameterTest {

	public static void main(String[] args) {
		
		System.out.println(summRek(200));
		
//		int n = 4;
//		int erg = 0;
//		for (int i = 0; i <= n; i++) {
//			erg +=i;
//		}
//		System.out.println(erg);
	}

	
	public static int summRek(int n) {
		
		if (n > 0) 
			return n + summRek(n-1);
		return 0;
	}
}
