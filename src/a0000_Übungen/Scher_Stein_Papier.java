package a0000_Übungen;

import java.util.Scanner;

public class Scher_Stein_Papier {

	public static void main (String[]agrs) {
		int computer, selber, sieg;
		
		do {
			computer = zahlZiehen();
			selber = selberWaehlen();
			sieg = gewonnen(computer, selber);
			if (sieg == 0)
				System.out.println("Unentschieden. Bitte nochmal spielen");
		}while(sieg == 0);
		siegerAusgeben(sieg);
	}

	private static void siegerAusgeben(int sieg) {
		if (sieg <0)
			System.out.println("Leider verloren");
		else
			System.out.println("Glückwunsch!");
	}

	private static int gewonnen(int computer, int selber) {
		if (computer == selber)
			return 0;
		if (computer == 1 && selber == 2) // c: Schere - p: Stein
			return 1;
		if (computer == 2 && selber == 3) // c: Stein - p: Papier
			return 1;
		if (computer == 3 && selber == 1)
			return 1;
		return -1;
	}

	private static int selberWaehlen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte wählen (Auswahl eingeben):\n[1]\tSchere\n[2]\tStein[3]\tPapier");
		String eingabe = sc.nextLine();
		sc.close();
		switch (eingabe) {
		case "Schere":
			return 1;
		case "Stein":
			return 2;
		case "Papier":
			return 3;
		}
		System.out.println("Bitte nochmal wählen");
		return selberWaehlen();
	}

	private static int zahlZiehen() {
		return (int) (Math.random() * 3) + 1;
	}

}
