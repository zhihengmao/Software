package tests;

import hw4.Grade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeTestA {
	Grade grade;
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testA() {
		assertEquals(grade.letterGrade(91),'A');
	}
	@Test
	void testB() {
		assertEquals(grade.letterGrade(89),'B');
	}
	@Test
	void testC() {
		assertEquals(grade.letterGrade(77),'C');
	}
	@Test
	void testD() {
		assertEquals(grade.letterGrade(69),'D');
	}
	@Test
	void testF() {
		assertEquals(grade.letterGrade(12),'F');
	}
	@Test
	void testX1() {
		assertEquals(grade.letterGrade(101),'X');
	}
	@Test
	void testX2() {
		assertEquals(grade.letterGrade(-2),'X');
	}
}
