package solver;

import static org.junit.Assert.*;

import org.junit.Test;

public class LetterCountTest {

	@Test
	public void testLessOrEqualLetters() {
		LetterCount dog = new LetterCount("dog");
		assertTrue(dog.hasLessOrEqualLetters("do"));
		assertTrue(dog.hasLessOrEqualLetters("go"));
		assertTrue(dog.hasLessOrEqualLetters("god"));
		assertFalse(dog.hasLessOrEqualLetters("dogg"));
		assertFalse(dog.hasLessOrEqualLetters("happy")); //really glad i wrote this one, forgot the else statement.
	}

}
