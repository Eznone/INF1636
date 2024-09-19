
public class Produto {
	private int cod;
	private String nome;
	private double precUnit;
	private static Produto []lst;
	
	public Produto(int c,String n,double p) {
		cod=c;
		nome=n;
		precUnit=p;
	}
	
	public static Produto [] listaProd() {
		lst=new Produto[10];
		
		lst[0]=new Produto(1000,"Detergente Abc",1.00);
		lst[1]=new Produto(1111,"Sabao Omo",6.50);
		lst[2]=new Produto(2222,"Sampoo Beleza",4.00);
		lst[3]=new Produto(3333,"Creme Dental Colgate",3.50);
		lst[4]=new Produto(4444,"Sabonete Nivea",1.00);
		lst[5]=new Produto(5555,"Biscoito Maizena",2.00);
		lst[6]=new Produto(6666,"Oleo Soya",4.00);
		lst[7]=new Produto(7777,"Leite Parmalat",2.00);
		lst[8]=new Produto(8888,"Iogurte Batavo",3.00);
		lst[9]=new Produto(9999,"Guarana em Lata",1.500);
		
		return lst;
	}
	
	public static Produto busca(int c) {
		for (int i = 0; i < lst.length; i++) {
			if (lst[i] != null && lst[i].cod == c) {
				return (lst[i]);
			}
		}
		
		return null;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPrecoUnit() {
		return this.precUnit;
	}
}
