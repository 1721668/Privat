package a0000_Übungen;

public class t02_bidirektional_Main {

	public static void main(String[] args) {
		t02_bidirektional_Student s = new t02_bidirektional_Student ("Max Meier", 123456);
		t02_bidirektional_Praktikum p = new t02_bidirektional_Praktikum ("p1");
		
		s.teilnehmen(p);
		System.out.println("");
	}

}
