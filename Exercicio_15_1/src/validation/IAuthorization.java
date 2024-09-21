package validation;

public interface IAuthorization {
	public int getCode();
	public String getPsw();
	public void incorrectAttempts();
	public int getNumberIncorrectAttempts();
}
