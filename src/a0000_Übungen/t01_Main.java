package a0000_Übungen;

public class t01_Main {

	public static void main(String[] args) {
		t01_Student s= new t01_Student("Jorgo",17231);
		s.setStudiengang(new t01_Studiengang());
		t01_Student s1= new t01_Student("Max",24336,new t01_Studiengang());
		System.out.println(s1.getName());
		System.out.println(s.getName());

	}

}
