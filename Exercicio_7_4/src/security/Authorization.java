package security;
import validation.IAuthorization; 

public class Authorization implements IAuthorization{
	private int cod;
	private String psw;
	private int attempts;
		
	
	public Authorization(int cod, String psw) {
		this.cod = cod;
		this.psw = psw;
	}
	
	public int getCode() {
		return this.cod;
	}
	
	public String getPsw() {
		System.out.println("Password: " + this.psw);
		return this.psw;
	}
	
	public void incorrectAttempts() {
		attempts++;
	}
	
	public int getNumberIncorrectAttempts() {
		return attempts;
	}
}
