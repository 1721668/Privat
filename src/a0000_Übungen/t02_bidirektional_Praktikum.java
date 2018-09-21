package a0000_Übungen;

import java.util.Arrays;

public class t02_bidirektional_Praktikum {
	private String name;
	private t02_bidirektional_Student [] student= new t02_bidirektional_Student[10];
	
	public t02_bidirektional_Praktikum(String name) {
		setName(name);
	}
	
	public void anmelden(t02_bidirektional_Student stu) {
		
		if(stu==null) {
			throw new RuntimeException("Student darf nicht Null sein");
		}
		for(int i=0; i<getStudent().length;i++) {
			if (student[i] != null && stu.equals(student[i]))
				return;
		}
		
		for(int i=0; i<getStudent().length;i++) {
			if(getStudent()[i]==null) {
				getStudent()[i]=stu;
				stu.teilnehmen(this);
				System.out.println("Student eingetragen");
				return;
			}
		}
		throw new RuntimeException("Das Praktikum hat schon 10 Studenten");
	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		t02_bidirektional_Praktikum other = (t02_bidirektional_Praktikum) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(student, other.student))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public t02_bidirektional_Student[] getStudent() {
		return student;
	}

	public void setStudent(t02_bidirektional_Student[] student) {
		this.student = student;
	}
	
	
	

}



