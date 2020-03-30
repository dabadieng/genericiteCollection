package GenericiteColl_package;

import java.util.LinkedList;
import java.util.List;

public class MainGenericiteColl {
	static void surfaceTotale(List<? extends Ustensile> tab) {
		double total = 0;
		for (Ustensile a : tab) {
			if (a instanceof Assiette) {
				//total += a.calculSurface();
				total += ((Assiette) a).calculSurface();
			}
		}

		System.out.println("la surface total des assiettes : " + total);
	}

	public static void main(String[] args) {

		List<Ustensile> ustensiles = new LinkedList<Ustensile>();
		ustensiles.add(new Culliere(1900, 3.10));
		ustensiles.add(new AssietteRonde(1900, 3));
		ustensiles.add(new AssietteCarre(2010, 5));

		Ustensile.valeurTotal(ustensiles);
		surfaceTotale(ustensiles);
	}

}
