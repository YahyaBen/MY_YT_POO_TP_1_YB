package figures;

public class Maiin {

	public static void main(String[] args) {
		Point c =new Point(150,150);
		Point p=new Point(200,200);
		Cercle A=new Cercle(c,p);
		Point cc =new Point(100,100);
		Cercle B=new Cercle(cc,50);
		Point d=new Point(130,130);
		
		System.out.println("Cercle A = ");
		System.out.println("Surface : "+A.getSurface());
		System.out.println("Perimetre : "+A.getPerimetre());
		System.out.println("Le Point appartien a A ou pas ? "+A.Appartient(d));
		System.out.println(A);
		
		System.out.println("Cercle B = ");
		System.out.println("Surface : "+B.getSurface());
		System.out.println("Perimetre : "+B.getPerimetre ());
		System.out.println("Le Point appartien a A ou pas ? "+B.Appartient(d));
		System.out.println(B);
	}
}
