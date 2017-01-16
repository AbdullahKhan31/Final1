package pk.ciit.MavenFinal;

import static org.junit.Assert.*;

import org.junit.*;

public class TestCalculator 
{
	Calculator cal=new Calculator();
	
	@Test
	public void testFindMax()
	{
		int result=cal.findMax(3, 4, 5);
		assertEquals(5, result);
	}
	
	@Test
	public void testSquare()
	{
		int result=cal.square(2);
		assertEquals(result,4);
	}

}
