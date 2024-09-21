package security;

import validation.*;


public class Authorization implements IAuthorization{
	private int code;
	private String psd;
	private int attempts = 0;
	
	public Authorization(int code, String psd) {
		this.code = code;
		this.psd = psd;
	}
	
	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getPsw() {
		return psd;
	}

	@Override
	public void incorrectAttempts() {
		attempts++;
		
	}

	@Override
	public int getNumberIncorrectAttempts() {
		return attempts;
	}
	
}
