package a0146_Aggregation_Freizeit;

import java.util.Arrays;

public class Freizeit {
	private Mensch[] teilnehmer = new Mensch[30];
	public Freizeit () {}
	
	public void anmelden(Mensch m) {
		
		for (int m1=0; m1<30; m1++) {
			if (teilnehmer[m1]!= null && teilnehmer[m1].equals(m)) {
				return;
			}
		}
		
		for (int m1=0; m1<30; m1++) {
			if (teilnehmer[m1] == null) {
				teilnehmer[m1] = m;
				m.teilnehmen(this);
				System.out.println("Teilnehmer hinzugefügt");
				return;
			}
		}
		System.err.println("Teilnehmermaximum erreicht!");
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Freizeit other = (Freizeit) obj;
		if (!Arrays.equals(teilnehmer, other.teilnehmer))
			return false;
		return true;
	}
	
}
