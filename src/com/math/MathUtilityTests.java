package com.math;

import static org.junit.Assert.*;

import org.junit.Test;


public class MathUtilityTests {

	@Test
	public void integerDivision(){
		
		assertEquals(1, MathUtility.integerDivision(2,2));
		assertEquals(2, MathUtility.integerDivision(2,1));
		assertEquals(1, MathUtility.integerDivision(3,2));
	}
	
	@Test
	public void findLargest(){
		
		assertEquals(2, MathUtility.findLargest(2,2));
		assertEquals(2, MathUtility.findLargest(2,1));
		assertEquals(3, MathUtility.findLargest(2,3));
	}
	
	@Test
	public void doubleDivision(){
		
		assertEquals(1, MathUtility.doubleDivision(2d,2), 0.01);
		assertEquals(2, MathUtility.doubleDivision(2.0,1), 0.01);
		assertEquals(1.5, MathUtility.doubleDivision(3,2), 0.01);
	}
	
	@Test
	public void findLargestFromArray(){
		
		assertEquals(7, MathUtility.findLargest(new int[]{1,3,7}));
	}
	
	@Test
	public void findLargestFromNullArray(){
		
		try{
			MathUtility.findLargest(null);
		}catch(NullPointerException e){
			assertEquals("I don't know what to do with a null array!", e.getMessage());
		}
	}
}
