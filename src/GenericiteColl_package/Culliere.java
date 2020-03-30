package GenericiteColl_package;

import java.util.List;

public class Culliere extends Ustensile {

	private double longeur;

	public Culliere(int dateUs, double longeur) {
		super(dateUs);
		this.longeur = longeur;
	}

	public double getLongeur() {
		return this.longeur;
	}
	
	static void totalCuilliere(List<? super Culliere> Cullieres) {
		int nb = Cullieres.size(); 
		System.out.println("le nombre de cuillières : "+nb);
	}

}
