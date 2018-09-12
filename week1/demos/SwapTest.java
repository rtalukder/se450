import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

class SwapTest {

	@Test
	void testSwap() {
		// Arrange
		StringObject obj1 = new StringObject("Hello");
		StringObject obj2 = new StringObject("World");
		
		// Act
		obj1.swap(obj2);
		
		// Assert
		assertEquals("World", obj1.str);
		assertEquals("Hello", obj2.str);
	}
	
	@Test
	void testSwapNull() {
		// Arrange
		StringObject obj1 = new StringObject("Hello");
		StringObject obj2 = new StringObject(null);
		
		// Act
		obj1.swap(obj2);
		
		// Assert
		assertEquals(null, obj1.str);
		assertEquals("Hello", obj2.str);
	}
	
	@Test
	void testSwapEmptyString() {
		// Arrange
		StringObject obj1 = new StringObject("Hello");
		StringObject obj2 = new StringObject("");
		
		// Act
		obj1.swap(obj2);
		
		// Assert
		assertEquals("", obj1.str);
		assertEquals("Hello", obj2.str);
	}
	
	@Test()
	void testSwapNullStringObject() {
		// Arrange
		StringObject obj1 = new StringObject("Hello");
		StringObject obj2 = null;
		
		// Act
		try {
			obj1.swap(obj2);
			fail();
		} catch(InvalidParameterException ex) {
			assertEquals("StringObject was null.", ex.getMessage());
		}
		
		// Assert
		assertEquals("Hello", obj1.str);		
	}

}
