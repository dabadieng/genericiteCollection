package GenericiteColl_package;

public class AssietteCarre extends Assiette {

	private double cote;

	public AssietteCarre(int dateUs, double cote) {
		super(dateUs);
		this.cote = cote;
	}

	public double calculSurface() {
		return this.cote*this.cote; 
	}
}
