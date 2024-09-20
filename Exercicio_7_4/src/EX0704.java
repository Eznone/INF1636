import security.*;
import java.util.*;
import validation.*;

public class EX0704 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DBAuthorization.carregaBD();
		int cod;
		String psw;
		Checker c=new Checker();
		
		System.out.println("Informe o c�digo");
		cod=s.nextInt();
		while(cod>0) {
			s.nextLine();
			System.out.println("Informe a password");
			psw=s.nextLine();
			if(c.check(cod,psw))
				System.out.println("Porta Aberta");
			else
				System.out.println("C�digo ou password inv�lido");
			System.out.println("Informe o c�digo");
			cod=s.nextInt();
		}
	}
}