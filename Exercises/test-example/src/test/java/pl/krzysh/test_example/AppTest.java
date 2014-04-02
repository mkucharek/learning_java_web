package pl.krzysh.test_example;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
	App app;
	
	@Before
	public void setUp()
	{
		app = new App();
	}
	
	@Test
    public void testApp()
    {
        assertTrue( true );
    }
    
	@Test
    public void testCalulations()
    {
    	assertEquals(4, app.dodaj(2, 2));
    	assertNotSame(4, app.dodaj(2, 3));
    }
	
	@Test
	public void testAccount()
	{
		Account account = new Account();
		assertEquals(0, account.getMoney());
		account.addMoney(50);
		assertEquals(50, account.getMoney());
		assertNotSame(0, account.getMoney());
		account.removeMoney(25);
		assertEquals(25, account.getMoney());
		assertNotSame(50, account.getMoney());
	}
	
	@Test
	public void testAccountArray()
	{
		Account[] accounts1 = new Account[2];
		accounts1[0] = new Account();
		accounts1[1] = new Account();
		Account[] accounts2 = new Account[2];
		accounts2[0] = new Account();
		accounts2[1] = new Account();
		assertTrue(Arrays.equals(accounts1, accounts2));
		accounts1[0].addMoney(15);
		assertFalse(Arrays.equals(accounts1, accounts2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testExceptions()
	{
		int i = 5/0;
	}
}
