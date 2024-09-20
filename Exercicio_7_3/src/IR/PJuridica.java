package IR;

public class PJuridica extends Contribuinte {
	protected String cnpj;
	
	public PJuridica(String n,double r,String c) {
		nome=n;
		rendaBrt=r;
		cnpj=c;
	}
	
	public double calcImposto() {
		return rendaBrt*0.1;
	}
}