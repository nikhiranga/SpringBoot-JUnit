package co.edureka;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert {
	
	@Test
	public void testAssertions()
	{
		String str=new String("nik");
		String str1=new String("nik");
		
		String str2=null;
		String str3="nik";
		String str4="nik";
		int val=4;
		int val1=5;
		
		String[] expectedArray= {"one","two","three"};
		String[] resultArray=  {"one","two","three"};
		
		assertEquals(str,str1);
		
		assertTrue(val<val1);
		assertFalse(val>val1);
		assertNotNull(str);
		assertNull(str2);
		assertSame(str3,str4);
		assertNotSame(str,str1);
		assertArrayEquals(expectedArray,resultArray);
		
	}

}
