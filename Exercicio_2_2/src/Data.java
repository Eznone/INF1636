
public class Data {
	private int Dia;
	private int Mes;
	private int Ano;
	
	public Data(int Dia, int Mes, int Ano) {
		this.Dia = Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}
	
	public int get(int e) {
		if (e == 1) {
			return (Dia);
		}
		else if (e == 2) {
			return (Mes);
		}
		else if (e == 3) {
			return (Ano);
		}
		else {
			return (-1);
		}
	}
	
	public String getString() {
		String diaStr = Integer.toString(Dia);
		String mesStr = Integer.toString(Mes);
		String anoStr = Integer.toString(Ano);
		
		return String.format("%s/%s/%s", diaStr, mesStr, anoStr);
	}
}
