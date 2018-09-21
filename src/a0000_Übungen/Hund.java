package a0000_Übungen;

public class Hund extends Tier {
	private String name;

	public Hund(int alter, String name) {
		super(alter);
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void gibLaut() {
		System.out.println("Wuff");
	}
	
	public void bellen() {
		gibLaut();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
