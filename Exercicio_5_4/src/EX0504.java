import lista.*;
import IR.*;

public class EX0504 {
	public static void main(String[] args) {
		Lista x=Contribuinte.getLista();;
		Contribuinte c;
		
		System.out.printf("NOME                       IMPOSTO\n");
		System.out.printf("====================       =======\n\n");
		
		x.posIni();
		c=(Contribuinte) x.prox();
		while(c!=null) {
			System.out.printf("%-20s     %9.2f\n",c.getNome(),c.calcImposto());
			c=(Contribuinte) x.prox();
		}		
	}
}