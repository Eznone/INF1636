
public class Vetor {
	private double x,y;
	
	public Vetor(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	private Vetor() {	
	}
	
	public Vetor clone() {
		Vetor v1=new Vetor();
		
		v1.x=x;
		v1.y=y;
		
		return v1;
	}
	
	public String toString() {
		return "( "+String.format("%.2f",x)+" , "+String.format("%.2f",y)+" )";
	}
	
	public boolean equals(Object o) {
		Vetor v=(Vetor) o;
		
		if(this.x==v.x && this.y==v.y)
			return true;
		else
			return false;
		
	}
}
