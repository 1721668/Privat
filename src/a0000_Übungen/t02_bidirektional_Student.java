package a0000_Übungen;

import java.util.Arrays;

public class t02_bidirektional_Student {
	private String name;
	private int matrNr;
	private t02_bidirektional_Praktikum[] prakrikum = new t02_bidirektional_Praktikum[3];

	public t02_bidirektional_Student(String name, int matrNr) {
		setName(name);
		setMatrNr(matrNr);
	}

	private void setMatrNr(int matrNr) {
		this.matrNr = matrNr;
	}
	
	public int getMatrNr() {
		return matrNr;
	}

	public void teilnehmen(t02_bidirektional_Praktikum pr) {

		if (pr == null) {
			throw new RuntimeException("Praktikum darf nicht Null sein");
		}
		for (int i = 0; i < getPrakrikum().length; i++) {
			if (prakrikum [i] != null && prakrikum[i].equals(pr))
				return;
		}
		
		for (int i = 0; i < getPrakrikum().length; i++) {
			if (getPrakrikum()[i] == null) {
				getPrakrikum()[i] = pr;
				pr.anmelden(this);
				System.out.println("anmeldung fertig");
				return;
			}
		}
		throw new RuntimeException("Student hat schon 3 Praktika");
	}
	
	@Override
	public int hashCode() {
		return this.getMatrNr();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		t02_bidirektional_Student other = (t02_bidirektional_Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(prakrikum, other.prakrikum))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public t02_bidirektional_Praktikum[] getPrakrikum() {
		return prakrikum;
	}

	public void setPrakrikum(t02_bidirektional_Praktikum[] prakrikum) {
		this.prakrikum = prakrikum;
	}
}
