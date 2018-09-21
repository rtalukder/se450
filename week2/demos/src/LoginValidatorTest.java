import org.junit.Test;

import static org.junit.Assert.*;



public class LoginValidatorTest {

	@Test
	public void testValidateLoginDoesntThrowExceptionForValidPassword() {
		// Arrange
		User user = new User();
		user.passwordHash = "testHash";
		IPasswordValidator passwordValidator = (User u, String pw) -> true;
		LoginValidator lv = new LoginValidator(passwordValidator);
		
		// Act
		try {
			lv.validateLogin(user, "password");
		} catch (Exception e) {
			fail();
		}
		
		// Assert
		assertTrue(true);
	}

	@Test
	public void testValidateLoginThrowsExceptionForInvalidPassword() {
		// Arrange
		User user = new User();
		user.passwordHash = "testHash";
		IPasswordValidator passwordValidator = (User u, String pw) -> false;
		LoginValidator lv = new LoginValidator(passwordValidator);
		
		// Act
		try {
			lv.validateLogin(user, "password");
			fail();
		} catch (Exception e) {
			
		}
		
		// Assert
	}
}
