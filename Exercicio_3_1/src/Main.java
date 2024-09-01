
public class Main {

	public static void main(String[] args) {
		Vetor v1 = new Vetor(3, 4);
		Vetor v2 = new Vetor(7, 6);

		v1.soma(v2);
		
		v1.exhibe();
		v2.exhibe();
		
		Vetor v3 = Vetor.soma(v1, v2); 
		v3.exhibe();
	}
}
