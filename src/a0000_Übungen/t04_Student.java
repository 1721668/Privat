package a0000_Übungen;

public class t04_Student implements Cloneable{

	private String name;
	private int matrNr;

	public t04_Student(String name, int matrNr) {
		setName(name);
		setMatrNr(matrNr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatrNr() {
		return matrNr;
	}

	public void setMatrNr(int matrNr) {
		this.matrNr = matrNr;
	}

	@Override
	public String toString() {
		return "Student mit Name: " + getName() + " und der Matrikelnummer: " + getMatrNr();
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (o.getClass() != this.getClass())
			return false;
		t04_Student st = (t04_Student) o;
		return st.hashCode() == this.hashCode();
	}
	
	@Override
	public int hashCode() {
		return matrNr;
	}
	
	@Override
	public t04_Student clone() {
		return new t04_Student(getName(),getMatrNr());
	}

}
