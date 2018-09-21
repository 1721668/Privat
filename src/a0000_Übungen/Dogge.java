package a0000_Übungen;

public class Dogge extends Hund{

	public Dogge(int alter, String name) {
		super(alter, name);
	}
	
	@Override
	public void gibLaut() {
		System.out.println("Wau");
	}

}
