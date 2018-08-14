package a0106_Casten_W�rfelgenerator;

public class Aufgabe {
	public static void main (String[] args) {
		System.out.println(w�rfeln(2));
		System.out.println(w�rfeln(1));
	}

	private static String w�rfeln(int i) { //mit falscher Eingabe �berpr�fen (-1 & 3)
		if (i<1 || i > 2) {
			System.err.println("Eingabe ung�ltig. nur 1 oder zwei W�rfel m�glich!");
			return null;
		}
		String w�rfel = null;
		switch (i) {
		case 1:{
			w�rfel = "Der Wurf des W�rfels hat folgendes ergeben: " + (int) (Math.random()*6+1); //gewollt abgeschnitten, daher nur zahlen von 1-6 m�glich
			break;
		}
		case 2:{
			w�rfel = "Der Wurf des ersten W�rfels hat die Zahl " + (int) (Math.random()*6+1) + " ergeben.";
			w�rfel += "\nDer Wurf des zweiten W�rfels hat die Zahl " + (int) (Math.random()*6+1) + " ergeben.";
		}
		}
		return w�rfel;
	}
}
