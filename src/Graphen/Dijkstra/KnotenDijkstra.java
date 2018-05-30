package Graphen.Dijkstra;

import Graphen.*;

public class KnotenDijkstra extends Knoten{
	private int distanz = Integer.MAX_VALUE;
	private KnotenDijkstra vorg�nger = null;
	
	public KnotenDijkstra (int id) {
		super (id);
	}
	
	public void setDistanz (int distanz) {
		if (distanz < 0)
			throw new RuntimeException("Distanz ung�ltig!");
		this.distanz = distanz;
	}
	
	public int getDistanz () {
		return this.distanz;
	}
	
	public void setVorg�nger (KnotenDijkstra vorg�nger) {
		this.vorg�nger = vorg�nger;
	}
	
	public KnotenDijkstra getVorg�nger () {
		return vorg�nger;
	}
}
