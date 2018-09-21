package a0000_Übungen;

public class t01_Student {
	private String name;
	private int matrikelnummer;
	private t01_Studiengang studiengang;
	
	public t01_Student(String name, int matrikelnummer) {
		setName(name);
		setMatrikelnummer(matrikelnummer);
	}
	
	public t01_Student(String name, int matrikelnummer, t01_Studiengang studiengang) {
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

	public t01_Studiengang getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(t01_Studiengang studiengang) {
		if (studiengang == null) {
			throw new RuntimeException("Studiengang ungueltig.");
		}
		this.studiengang = studiengang;
	}

}
