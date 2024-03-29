import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class NinjaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		Ninja aNinja = new Ninja ("Bill", "Sword");
		assertEquals("Result", "Bill", aNinja.getName());
	}

	@Test
	public void testSetName() {
		Ninja aNinja = new Ninja ("Bill", "Sword");
		aNinja.setName("Bob");
		assertEquals("Result", "Bob", aNinja.getName());
	}
	
	@Test
	public void testDisAppear() {
		Ninja aNinja = new Ninja ("Bill", "Sword");
		aNinja.disAppear();
		assertEquals("Result", false, aNinja.checkVisibility());
	}
	
	@Test
	public void testReAppear() {
		Ninja aNinja = new Ninja ("Bill", "Sword");
		aNinja.disAppear();
		assertEquals("Result", false, aNinja.checkVisibility());
		aNinja.reAppear();
		assertEquals("Result", true, aNinja.checkVisibility());
	}


}
