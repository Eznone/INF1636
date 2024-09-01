
public class Main {

	public static void main(String[] args) {
		Data d = new Data(11, 8, 2011);
		
		String meses[]={"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET"," OUT","NOV","DEZ"};
		
		System.out.println("Data Editada: "+d.getString());
		
		System.out.println(d.get(1)+" de "+meses[d.get(2)-1]+" de "+d.get(3));
	}

}
