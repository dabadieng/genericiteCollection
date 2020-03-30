package GenericiteColl_package;

import java.util.List;

public abstract class Ustensile {
	private int dateUs;
	private static final int ANNEE = 2020;

	public Ustensile(int dateUs) {
		this.dateUs = dateUs;
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
	
	

}
