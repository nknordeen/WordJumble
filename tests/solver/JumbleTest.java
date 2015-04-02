package solver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class JumbleTest {

	@Test
	public void testGetAllWords() {
		String[] list = {"cat", "do","dog","god", "gods", "dogs"};
		Jumble myJumble = new Jumble("dog", list);
		String[] solution = { "do", "dog", "god" };
		ArrayList<String> allWords = myJumble.getAllWords();
		assertEquals(solution.length, allWords.size());
		for(int i = 0; i < solution.length; i++){
			assertEquals(solution[i], allWords.get(i));
		}
	}
}
