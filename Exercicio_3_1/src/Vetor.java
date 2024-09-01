
public class Vetor {
	private double x;
	private double y;
	
	public Vetor () {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Vetor (double x) {
		this.x = x;
		this.y = 0.0;
	}
	
	public Vetor (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void soma(Vetor v) {
		this.x = this.x + v.x;
		this.y = this.y + v.y;
	}
	
	public static Vetor soma(Vetor v1, Vetor v2) {
        return new Vetor(v1.x + v2.x, v1.y + v2.y);
    }
	
	public void exhibe() {
		System.out.printf("x=%5.2f y=%5.2f \n", x, y); 
	}
}

