
public class EX0402 {

	public static void main(String[] args) {
		Vetor v=new Vetor(3.347890,4.67890);
		Vetor v1;
		
		v1=v.clone();
		System.out.println(v.toString());
		System.out.println(v1.toString());
		
		if(v1.equals(v))
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");
		
	}
}