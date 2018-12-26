package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw4.Grade;

class GradeTestB {

	Grade grade;
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoundary1() {
		assertEquals(grade.letterGrade(-2),'X');
		assertEquals(grade.letterGrade(101),'X');
	}
	@Test
	public void testBoundary2() {
		assertEquals(grade.letterGrade(0),'F');
		assertEquals(grade.letterGrade(14),'F');
		assertEquals(grade.letterGrade(59),'F');
	}
	@Test
	public void testBoundary3() {
		assertEquals(grade.letterGrade(60),'D');
		assertEquals(grade.letterGrade(67),'D');
		assertEquals(grade.letterGrade(69),'D');
	}
	@Test
	public void testBoundary4() {
		assertEquals(grade.letterGrade(70),'C');
		assertEquals(grade.letterGrade(76),'C');
		assertEquals(grade.letterGrade(79),'C');
	}
	@Test
	public void testBoundary5() {
		assertEquals(grade.letterGrade(80),'B');
		assertEquals(grade.letterGrade(84),'B');
		assertEquals(grade.letterGrade(89),'B');
	}
	
	@Test
	public void testBoundary6() {
		assertEquals(grade.letterGrade(90),'A');
		assertEquals(grade.letterGrade(93),'A');
		assertEquals(grade.letterGrade(100),'A');
	}

}
