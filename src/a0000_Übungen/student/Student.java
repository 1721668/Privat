package a0000_Übungen.student;

public class Student {
	private String name;
	private int matrikelnummer;
	private Studiengang studiengang;
	
	public Student(String name, int matrikelnummer) {
		setName(name);
		setMatrikelnummer(matrikelnummer);
	}
	
	public Student(String name, int matrikelnummer, Studiengang studiengang) {
		this(name, matrikelnummer);
		setStudiengang(studiengang);
	}
	
	private void setMatrikelnummer(int matrikelnummer) {
		if (matrikelnummer < 10000 || matrikelnummer > 99999)
			throw new RuntimeException("Matrikelnummer ungueltig.");
		this.matrikelnummer = matrikelnummer;
	}

	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}

	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new RuntimeException("Name ungueltig.");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Studiengang getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(Studiengang studiengang) {
		if (studiengang == null) {
			throw new RuntimeException("Studiengang ungueltig.");
		}
		this.studiengang = studiengang;
	}

}
