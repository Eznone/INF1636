
public class EX0303 {
	public static void main(String[] args) {
		System.out.println(Matematica.pi(100000));
//		System.out.println(obtemPi(100000));
	}
	
	public double obtemPi(int n) {
		return Matematica.pi(100000);
	}
}