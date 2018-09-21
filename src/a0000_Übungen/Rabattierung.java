package a0000_Übungen;

public class Rabattierung {

	public static void main(String[] args) {
		String kundenart = "kunde";
		int wert = 8000;
		int anzahlBestellungen = 5;
		kundenart = (anzahlBestellungen >= 7) ? "VIP-Kunde" : kundenart;
		int prozentsatz = 0;
		switch (kundenart) {
		case "Neukunde":
			prozentsatz = (wert > 10000) ? 10 : 5;
			break;
		case "Standartkunde":
			prozentsatz = (wert > 10000) ? 5 : 0;
			break;
		case "VIP-Kunde":
			prozentsatz = (wert > 7000) ? 12 : 7;
			break;
		default:
			System.out.println("Fehler bei der Kundenart!");
			System.exit(0);
		}
		System.out.println(prozentsatz);
	}
}
