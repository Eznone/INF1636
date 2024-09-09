
public class Matematica {
	public static double pi(int n) {
		double soma=0.0,den=1.0,fat=1.0;
		int i=0;

		for(;i<n;i++) {
			soma+=1.0/den*fat;
			fat*=-1.0;
			den+=2.0;
		}
		return 4.0*soma;
	}
}
