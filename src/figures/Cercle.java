package figures;

public class Cercle {
	private Point Centre;
	private double Rayon;
	
	public Cercle() {
		
	}
	public Cercle(Point A, double B) {
		this.Centre=A;
		this.Rayon=B;
		
	}
	
	public Cercle(Point C, Point D) {
		this.Centre=C;
		this.Rayon=Centre.Distance(D);		
	}
	
	public double getSurface() {
		return (Math.PI)*(Rayon*Rayon);
	}
	
	public double getPerimetre() {
		return 2*(Math.PI)*(Rayon);
	}
	
	public boolean Appartient(Point E) {
		if(Centre.Distance(E)<=Rayon) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "x = "+Centre.x+" <--> y = "+Centre.y+" <--> Rayon = "+Rayon;
	}
}
