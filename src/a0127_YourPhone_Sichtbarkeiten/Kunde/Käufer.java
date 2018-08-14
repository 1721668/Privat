package a0127_YourPhone_Sichtbarkeiten.Kunde;

import a0127_YourPhone_Sichtbarkeiten.YourPhone.Produkt;

public class K�ufer {
	private Produkt[] bestellKatalog = null;
	public K�ufer (Produkt[] bestellKatalog) {
		this.bestellKatalog = bestellKatalog;
	}
	
	public String  produktInfosAnfragen() {
		String ausgabe = "Name\t|\tBeschreibung:\t|\tLieferzeit:\t|\tPreis:\n";
		for (Produkt t: bestellKatalog) {
			ausgabe += t.getBezeichnung() + "\t\t" + t.getBeschreibung() + "\t" + t.getLieferZeitInTagen() + "\t\t\t" + t.getPreisUVP() + "\n";
		}
		return ausgabe;
	}
}
