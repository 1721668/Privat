package a0000_Übungen;

public class t03_Object_Student extends Object{
	private String name, vorname, adresse;
	private int matrNr;
	
	public t03_Object_Student (String name, String vorname, String adresse, int matrNr) {
		setName(name);
		setVorname(vorname);
		setAdresse(adresse);
		setMatrNr(matrNr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getMatrNr() {
		return matrNr;
	}

	public void setMatrNr(int matrNr) {
		this.matrNr = matrNr;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nVorname:" + getVorname() + " \nMatrNr: " + getMatrNr();
	}
	
	@Override
	public int hashCode() {
		return matrNr;
	}
	
	@Override
	public boolean equals (Object o) {
		if (o == null) return false;
		if (o == this) return true;
		if(o.getClass() != this.getClass()) return false;
		t03_Object_Student s = (t03_Object_Student) o;
		if (s.hashCode() == this.hashCode()) return true;
		return false;
	}
}
