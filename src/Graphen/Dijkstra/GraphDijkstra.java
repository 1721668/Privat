package Graphen.Dijkstra;

import Graphen.*;
import java.util.ArrayList;

public class GraphDijkstra extends Graph{
	
	public GraphDijkstra () {
		super();
	}
	
	public void init () {
		for(Knoten knAusListe: getKnoten()) {
			KnotenDijkstra kd = (KnotenDijkstra) knAusListe;
			kd.setVorg�nger(null);
			kd.setDistanz(Integer.MAX_VALUE);
		}
	}
	
	public ArrayList <KnotenDijkstra> k�rzersterWeg (int start, int ende){
		init();
		KnotenDijkstra s = (KnotenDijkstra) getKnoten(start);
		KnotenDijkstra e = (KnotenDijkstra) getKnoten(ende);
		if ((s == null) || (e == null))
			return null;
		if (s == e)
			return null;
		s.setDistanz(0);
		ArrayList<KnotenDijkstra> q = new ArrayList<KnotenDijkstra>();
		for (Knoten kn : getKnoten()) //der Arraylist alle Knoten hinzuf�gen
			q.add((KnotenDijkstra) kn);
		do {
			KnotenDijkstra gew�hlt = null;
			for (KnotenDijkstra x : q) {
				if (gew�hlt == null)
					gew�hlt = x;
				if(gew�hlt.getDistanz() > x.getDistanz()) //wenn der neue Knoten leichter erreichbar ist, tauschen
					gew�hlt = x;
			}
			q.remove(gew�hlt);//aktuelle Auswahl aus Performancegr�nden l�schen 
			for(Kante ka: gew�hlt.getKanten()) { //Kanten des Knoten durchlaufen
				KanteDijkstra kaD= (KanteDijkstra) ka;
				KnotenDijkstra knD = (KnotenDijkstra) ka.getAnderesEnde(gew�hlt);
				if (q.contains(knD)) { //wenn ich noch nicht dort war (noch nicht gel�scht)
					if(gew�hlt.getDistanz() +kaD.getDistanz() < knD.getDistanz()) { //wenn neuer Laufweg kleiner dem aktuellen des Knoten ist
						knD.setDistanz(gew�hlt.getDistanz()+kaD.getDistanz());
						knD.setVorg�nger(gew�hlt);
					}
				}
			}
		}while (q.size()>0);
		ArrayList <KnotenDijkstra> aus =new ArrayList<KnotenDijkstra>();
		KnotenDijkstra x = e;
		do { //vorg�nger r�ckw�rts durchlaufen um nur einmal speichern zu m�ssen
			aus.add(0,x);
			x = x.getVorg�nger();
		}while (x != null);
		return aus;
	}
	
}
