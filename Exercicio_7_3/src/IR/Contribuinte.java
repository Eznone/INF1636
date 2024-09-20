package IR;

public abstract class Contribuinte {
	protected String nome;
	protected double rendaBrt;
	
	public String getNome() {
		return nome;
	}
	
	abstract public double calcImposto();
}
