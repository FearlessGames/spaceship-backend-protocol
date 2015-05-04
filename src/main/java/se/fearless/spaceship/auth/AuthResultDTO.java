package se.fearless.spaceship.auth;

public class AuthResultDTO {
	public static final AuthResultDTO FAIL_RESULT = new AuthResultDTO(false, null);
	boolean success;
	String userName;

	private AuthResultDTO(boolean success, String userName) {
		this.success = success;
		this.userName = userName;
	}

	public static AuthResultDTO success(String userName) {
		return new AuthResultDTO(true, userName);
	}

	public static AuthResultDTO fail() {
		return FAIL_RESULT;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getUserName() {
		return userName;
	}
}
