package Datenstrukturen.EinfacheVerketteteListe;


import javax.management.relation.RelationTypeNotFoundException;

public class EinfacheVerketteteListe {
	private Knoten wurzel;
	
	public EinfacheVerketteteListe (Object o) {
		wurzel = new Knoten (o,null);
	}
	
	public Object getFirst () {
		if (wurzel == null) return null;
		return wurzel.getData();
	}
	
	public Object get (int pos) {
		int anz = this.getAnzKnoten();
		if ((pos<1) || (pos>anz))
			throw new RuntimeException ("Position ung�ltig");
		Knoten k = wurzel;
		for (int i = 1; i< pos; i++) {
			k=k.getNext();
		}
		return k.getData();
	}
	
	public int getAnzKnoten () {
		if (wurzel == null) return 0;
		Knoten k = wurzel;
		Knoten n�chster;
		int anz = 0;
		do {
			n�chster = k.getNext();
			k = n�chster;
			anz++;
		}while (n�chster != null);
		return anz;
	}
	
	public Object [] getAll() {
		int anz = this.getAnzKnoten();
		if (anz == 0) return new Object [0];
		Object [] array = new Object [anz];
		array[0] = wurzel.getData();
		Knoten k = wurzel.getNext();
		for (int i = 1; i < anz; i++) {
			array [i] = k.getData();
			if (k != null) k=k.getNext();
		}
		return array;
	}

	public void removeFirst() {
		if (wurzel != null) wurzel = wurzel.getNext();
	}

	public void removeLast () {
		if (wurzel == null) return;
		if (wurzel.getNext() == null)
			wurzel = null;
		else {
			Knoten k = wurzel;
			Knoten n�chster = null;
			Knoten vorheriger = null;
			do {
				n�chster = k.getNext();
				if (n�chster != null) {
					vorheriger = k;
					k = n�chster;
				}
			}while (n�chster != null);
			vorheriger.setNext(null);
		}
	}

	public void remove (int pos) {
		int anz = this.getAnzKnoten();
		if ((pos < 1) || (pos > anz)) return;
		if (pos == 1) {
			this.removeLast(); 
			return;
		}
		if (pos == anz) {
			this.removeLast();
			return;
		}
		Knoten k = wurzel;
		Knoten n�chster = null;
		Knoten vorheriger = null;
		for (int i = 1; i < pos; i++) {
			vorheriger = k;
			k = k.getNext();
		}
		n�chster = k.getNext();
		vorheriger.setNext(n�chster);
	}

	public void addFirst (Object o) {
		Knoten k = new Knoten (o,wurzel);
		wurzel = k;
	}
	
	public void addLast (Object o) {
		Knoten k = wurzel;
		Knoten n�chster;
		do {
			n�chster = k.getNext();
			if (n�chster != null) k = n�chster;
		}while(n�chster != null);
		n�chster = new Knoten (o,null);
		k.setNext(n�chster);
	}
	
	public Object getLast() {
		Knoten k = wurzel;
		Knoten n�chster;
		do {
			n�chster = k.getNext();
			if (n�chster != null) k = n�chster;
		}while(n�chster != null);
		return k;
	}
	
	public void add (int pos, Object o) {
		int anz = this.getAnzKnoten();
		if ((pos < 1)||(pos > anz))
			throw new RuntimeException("Position ung�ltig");
		if (pos == 1) {
			this.addFirst(o);
			return;
		}
		Knoten k = wurzel;
		for (int i = 1; i < pos; i++)
			k = k.getNext();
		Knoten neu = new Knoten (o,k.getNext());
		k.setNext(neu);
	}
	
}
