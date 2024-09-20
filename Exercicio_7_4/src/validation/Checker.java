package validation;

import security.*;

public class Checker {
	public boolean check(int cod, String psw) {
		IAuthorization authorization = DBAuthorization.getAuthorization(cod);
		
		if (authorization == null) {
			return false;
		}
		
		
		if (authorization.getPsw().equals(psw) && authorization.getNumberIncorrectAttempts() < 3) {
			return true;
		}
		authorization.incorrectAttempts();
		return false;
	}
}
