
public class Socio {
	
	String nome;
	String endereco;
	String StNasc;
	int matric;
	
	public Socio (int x) {
		matric = x;
	}
	
	public String getMatric() {
		String remainderStr = Integer.toString(matric % 10);
		String wholeStr = Integer.toString(matric / 10);
		return (wholeStr + "-" + remainderStr);
	}
	
	public static void main(String[] args) {
		Socio s = new Socio(123456);
		
		System.out.println(s.getMatric());
	}

}
