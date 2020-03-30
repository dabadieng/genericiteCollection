package GenericiteColl_package;

public class AssietteRonde extends Assiette {
	private double rayon;

	public AssietteRonde(int dateUs, double rayon) {
		super(dateUs);
		this.rayon = rayon;
	}
	
	public double calculSurface() {
		return 3.14*this.rayon*this.rayon;
	}
	
	
}
