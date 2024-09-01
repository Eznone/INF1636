
public class Vetor {
	private double x;
	private double y;
	
	
	public Vetor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double calcularModulo() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
}
