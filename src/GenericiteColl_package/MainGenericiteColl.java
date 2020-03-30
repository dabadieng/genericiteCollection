package GenericiteColl_package;

import java.util.LinkedList;
import java.util.List;

public class MainGenericiteColl {
	

	public static void main(String[] args) {

		List<Ustensile> ustensiles = new LinkedList<Ustensile>();
		ustensiles.add(new Culliere(1900, 3.10));
		ustensiles.add(new AssietteRonde(1900, 3));
		ustensiles.add(new AssietteCarre(2010, 5));

		Ustensile.valeurTotal(ustensiles);
		surfaceTotale(ustensiles);
	}

}
