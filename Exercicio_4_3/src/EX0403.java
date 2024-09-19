import lista.Lista;

public class EX0403 {
	public static void main(String[] args) {
		Lista x=new Lista();
		Vetor v;
		
		x.insIni(new Vetor(2.0,3.0));
		x.insFin(new Vetor(4.0,5.0));
		x.insIni(new Vetor(6.0,7.0));
		x.insFin(new Vetor(8.0,9.0));
		
		x.posIni();
		v=(Vetor) x.prox();
		while(v!=null) {
			System.out.printf("%s \n",v.toString());
			v=(Vetor) x.prox();
		}		
	}
}