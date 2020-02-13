package figures;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		
	}
	
	public Point(int A, int B) {
		this.x=A;
		this.y=B;
	}
	public double Distance(Point C) {
		int a = C.x - this.x;
		int b = C.y - this.y;
		return Math.sqrt((a*a)+(b*b));
	}

}
