package a0000_Übungen;

public class Katze extends Tier{

	public Katze(int alter) {
		super(alter);
		
	}

	@Override
	public void gibLaut() {
		System.out.println("Miau");
	}

}
