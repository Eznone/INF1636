package validation;

import security.*;

public class Checker {
	public boolean check(int cod, String psw) {
		IAuthorization Authorization = DBAuthorization.getAuthorization(cod);
		
		if (Authorization == null) {
			return false;
		}
		
		if (Authorization.getPsw().equals(psw) && Authorization.getNumberIncorrectAttempts() < 3) {
			return true;
		
		}
		Authorization.incorrectAttempts();
		return false;
	}
}
