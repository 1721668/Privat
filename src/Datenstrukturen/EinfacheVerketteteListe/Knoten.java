package Datenstrukturen.EinfacheVerketteteListe;

public class Knoten {
	private Object o;
	private Knoten n�chster;
	
	public Knoten (Object o, Knoten n�chster) {
		this.setData(o);
		this.setNext(n�chster);
	}

	public void setNext(Knoten n�chster) {
		this.n�chster = n�chster;
	}
	
	public Knoten getNext () {
		return this.n�chster;
	}

	public void setData(Object o) {
		this.o = o;
	}
	
	public Object getData() {
		return this.o;
	}
	
	@Override
	public String toString () {
		if (this.getData() == null) return null;
		return this.getData().toString();
	}
	
	
}
