package a0146_Aggregation_Freizeit;

import java.util.Arrays;

public class Mensch {
	private Freizeit[] freizeiten = new Freizeit[3];
	public Mensch() {}
	
	public void teilnehmen (Freizeit f){
		for (int f1=0; f1<3; f1++) {
			if (freizeiten[f1]!= null && freizeiten[f1].equals(f)) {
				return;
			}
		}
		for (int f1=0; f1<3; f1++) {
			if (freizeiten[f1] == null) {
				freizeiten[f1] = f;
				f.anmelden(this);
				System.out.println("An Freizeit angemeldet");
				return;
			}
		}
		System.err.println("Freizeitmaximum erreicht!");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensch other = (Mensch) obj;
		if (!Arrays.equals(freizeiten, other.freizeiten))
			return false;
		return true;
	}
	
	
}