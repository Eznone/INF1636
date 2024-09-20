import Lista.*;
import IR.*;

public class EX0703 {
	public static void main(String[] args) {
		Pilha x=FabricaPilha.cria();
		
		Contribuinte c;
		
		c=new PFisica("Joao Santos",3000.00,"11111");
		x.push(c);
		c=new PJuridica("Lojas AA",150000.00,"10055");
		x.push(c);
		c=new PFisica("Maria Soares",5000.00,"22222");
		x.push(c);
		c=new PJuridica("Supermercados B",2000000.00,"10066");
		x.push(c);
		c=new PFisica("Carla Maia",1500.00,"33333");
		x.push(c);
		c=new PJuridica("Posto XX",500000.00,"10077");
		x.push(c);
		
		while(!x.empty()) {
			c=(Contribuinte) x.pop();
			System.out.printf("%-20s \t %9.2f\n",c.getNome(),c.calcImposto());
		}		
	}
}