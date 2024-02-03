package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {

	TriangleClassifier triangle = new TriangleClassifier();
	@Test

	public void C1Fc2Fc3Fc4F(){

		int a = 1;

		int b = 2;

		int c=3;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.Nottriangle.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}
	@Test

	public void C1Fc2Fc3Fc4T(){

		int a = 7;

		int b = 3;

		int c=3;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.Nottriangle.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}
	@Test

	public void C1Fc2Fc3Tc4F(){

		int a = 3;

		int b = 7;

		int c=3;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.Nottriangle.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}
	@Test

	public void C1Fc2Tc3Fc4F(){

		int a = 3;

		int b = 3;

		int c=7;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.Nottriangle.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}
	@Test

	public void C1Tc2Fc3Fc4F(){

		int a = 2;

		int b = 3;

		int c=4;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.Scalene.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}

	@Test

	public void C1Tc2Fc3Fc4T(){

		int a = 3;

		int b = 2;

		int c=2;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.isosceles.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}
	@Test

	public void C1Tc2Fc3Tc4F(){

		int a = 2;

		int b = 3;

		int c=2;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.isosceles.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}

	@Test

	public void C1Tc2Tc3Fc4F(){

		int a = 2;

		int b = 2;

		int c=3;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.isosceles.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}

	@Test

	public void equilateralTriangle(){

		int a = 2;

		int b = 2;

		int c=2;

		triangle.classifyTriangle(a,b,c);

		String expected =Triangle_Types.equilateral.toString();

		String result = triangle.get_type().toString();

		assertEquals(expected, result.toString());

	}


}