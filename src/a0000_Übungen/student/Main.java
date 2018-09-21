package a0000_Übungen.student;

public class Main {

	public static void main(String[] args) {
		Student s= new Student("Jorgo",17231);
		s.setStudiengang(new Studiengang());
		Student s1= new Student("Max",24336,new Studiengang());
		System.out.println(s1.getName());
		System.out.println(s.getName());

	}

}
