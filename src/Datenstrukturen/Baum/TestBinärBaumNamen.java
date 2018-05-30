package Datenstrukturen.Baum;

public class TestBin�rBaumNamen {
	public static void main (String [] args) {
		testNormal();
		testUng�nstig();
		testG�nstig();
	}
	private static void testNormal () {
		System.err.println("----------------");
		Bin�rbaumNamen bn = new Bin�rbaumNamen("Marius");
		bn.einf�gen("Marc");
		bn.einf�gen("Hendrik");
		bn.einf�gen("Caroline");
		bn.einf�gen("Magnus");
		bn.einf�gen("Jan");
		bn.einf�gen("Cora");
		bn.einf�gen("Tina");
		bn.einf�gen("Achim");
		System.out.println("H�he: " + bn.getH�he());
		bn.l�schen ("Achim");
		System.out.println(bn.inOrderAusgabe());
		System.out.println(bn.getKleinster());
		System.out.println(bn.getKnoten("Marius"));
		System.out.println("L: " + bn.getKnoten ("Marius").getLinks());
		System.out.println("R: " + bn.getKnoten ("Marius").getRechts());
	}
	
	private static void testUng�nstig () {
		System.err.println("----------------");
		Bin�rbaumNamen bn = new Bin�rbaumNamen("A");
		bn.einf�gen("Achim");
		bn.einf�gen("Caro");
		bn.einf�gen("Cora");
		bn.einf�gen("Marius");
		bn.einf�gen("Tina");
		bn.einf�gen("Urs");
		bn.einf�gen("Zelda");
		System.out.println("H�he: " + bn.getH�he());
		System.out.println(bn.inOrderAusgabe());
	}
	
	private static void testG�nstig () {
		System.err.println("----------------");
		Bin�rbaumNamen bn = new Bin�rbaumNamen("A");
		bn.einf�gen("Cora");
		bn.einf�gen("Achim");
		bn.einf�gen("Caro");
		bn.einf�gen("Marius");
		bn.einf�gen("Tina");
		bn.einf�gen("Marriuss");
		System.out.println("H�he: " + bn.getH�he());
		System.out.println(bn.inOrderAusgabe());
	}
}
