package Testen;

public class Primzahlen {
	public static void main(String [] args) {
		System.out.println(primZählen(20));
//		System.out.println(berechnenObPrimzahl(13));
	}
	
	public static boolean berechnenObPrimzahl(int n) {
		for (int i = 2; i < n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
	
	private static int primZählen(int zahl) {
		int counter = 0;
		for (int i = 1; i <= zahl; i++) {
			if (berechnenObPrimzahl(i))
				counter ++;
		}
		return counter;
	}
}
