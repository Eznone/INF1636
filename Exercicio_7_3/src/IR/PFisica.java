package IR;

public class PFisica extends Contribuinte {
	protected String cpf;
	
	public PFisica(String n,double r,String c) {
		nome=n;
		rendaBrt=r;
		cpf=c;
	}
	
	public double calcImposto()	{
		if(rendaBrt<1400.00)
			return 0.0;
		else
			if(rendaBrt<=2100.00)
				return rendaBrt*0.1-100.00;
			else
				if(rendaBrt<=2800.00)
					return rendaBrt*0.15-270.00;
				else
					if(rendaBrt<=3600.00)
						return rendaBrt*0.25-500.00;
					else
						return rendaBrt*0.3-700.00;
	}	
}