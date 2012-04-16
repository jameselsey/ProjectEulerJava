package Problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class Problem1Test
{
	private Problem1 problem1;

	@Before
	public void setUp() throws Exception
	{
		problem1 = new Problem1();
	}

	@Test
	public void testAssumptionFromProblemGuideline()
	{
		assertEquals(23, problem1.execute(10));
	}

	@Test
	public void upperLimitSetTo1000ReturnsCorrectAnswer()
	{
		assertEquals(233168, problem1.execute(1000));
	}
}
