package GenericiteColl_package;

import java.util.List;

public abstract class Ustensile {
	private int dateUs;
	private static final int ANNEE = 2020;

	public Ustensile(int dateUs) {
		this.dateUs = dateUs;
	}

	public abstract double calculSurface();

	static void surfaceTotale (List <? extends Ustensile> tab) {
		double total = 0;
		for (Ustensile a : tab) {
			if (a instanceof Assiette) {
				total += a.calculSurface();
			}
		}

		System.out.println("la surface total des assiettes : " + total);
	}

	static void calculQuantite(List<? extends Ustensile> tab) {
		int nbCuilliere;
		for (Ustensile u : tab) {
			if (u instanceof Culliere) {
				nbCuilliere++;
			}

		}
		System.out.println("le nombre de cuilllères est de : " + nbCuilliere);
	}

	static void valeurTotal(List<? extends Ustensile> Ustensiles) {
		double valeur = 0;
		for (Ustensile U : Ustensiles) {
			if (U.getAnnee() - U.getDateUs() > 50) {
				valeur += U.getAnnee() - U.getDateUs() - 50;
			}
		}
		System.out.println("la valeur total des ustensiles : " + valeur);

	}

	public static int getAnnee() {
		return ANNEE;
	}

	public int getDateUs() {
		return dateUs;
	}

	static void surfaceTotale(List<? extends Ustensile> tab) {
		double total = 0;
		for (Ustensile a : tab) {
			if (a instanceof Assiette) {
				total += a.calculSurface(); 
				//total += ((Assiette) a).calculSurface();
			}
		}
	
	

}
