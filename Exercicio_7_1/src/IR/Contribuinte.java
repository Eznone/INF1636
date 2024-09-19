package IR;

import lista.*;

public abstract class Contribuinte {
	protected String nome;
	protected double rendaBrt;
	
	public static Lista getLista() {
		Lista x=new Lista();
	
		Contribuinte c;
		
		c=new PFisica("Joao Santos",3000.00,"11111");
		x.insFin(c);
		c=new PJuridica("Lojas AA",150000.00,"10055");
		x.insFin(c);
		c=new PFisica("Maria Soares",5000.00,"22222");
		x.insFin(c);
		c=new PJuridica("Supermercados B",2000000.00,"10066");
		x.insFin(c);
		c=new PFisica("Carla Maia",1500.00,"33333");
		x.insFin(c);
		c=new PJuridica("Posto XX",500000.00,"10077");
		x.insFin(c);
		
		return x;
	}
	
	public String getNome() {
		return nome;
	}
	
	abstract public double calcImposto();
}
