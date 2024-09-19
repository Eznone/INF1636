import java.util.Scanner;

public class EX0601 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Produto p;
		Venda v=new Venda();
		
		int cod,qtd;
		
		Produto.listaProd();
		
		System.out.println("Informe o codigo");
		cod=s.nextInt();
		while(cod!=0) {
			p=Produto.busca(cod);
			if(p==null)
				System.out.println("Produto inexistente");
			else {
				System.out.println("Informe a quantidade");
				qtd=s.nextInt();
				v.setProd(p,qtd);
			}
			System.out.println("Informe o codigo");
			cod=s.nextInt();				
		}
		
		System.out.println("Total:"+v.valorTotal());
	}
}
