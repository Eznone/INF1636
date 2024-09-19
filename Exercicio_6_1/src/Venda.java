
public class Venda {
	private Produto[] lstProd=new Produto[100];
	private int qtdProd[]=new int[100];
	private int qtdItens=0;
	
	public void setProd(Produto p,int qtd) {
		this.lstProd[qtdItens] = p;
		this.qtdProd[qtdItens] = qtd;
		this.qtdItens = this.qtdItens + 1;
	}
	public double valorTotal() {
		double total = 0;
		for (int i = 0; i < qtdItens; i++) {
			total += this.lstProd[i].getPrecoUnit() * this.qtdProd[i];
		}
		return total;
	}
}
