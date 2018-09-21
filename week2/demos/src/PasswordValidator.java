
public class PasswordValidator implements IPasswordValidator {
	private IPasswordHasher _passwordHasher;
	
	public PasswordValidator(IPasswordHasher passwordHasher){
		_passwordHasher = passwordHasher;
	}
	
	@Override
	public boolean isPasswordValid(User user, String password) {
		// Pretend this is a fancy hash algorithm
		String hashedPassword = _passwordHasher.getPasswordHash(password);
		return hashedPassword.equals(user.passwordHash);
	}

}
