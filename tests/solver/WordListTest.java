package solver;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class WordListTest {

	/*
	 * a not very needed test, because the test is pretty much verbatim of the constructor,
	 * but I just want to make sure that the order I'm adding the words is correct.
	 */
	@Test
	public void testWordList() {
		String filePath = "/home/nicholas/Downloads/wordlists/english-words.10.txt";
		WordList list = new WordList(filePath);
		BufferedReader buffer = null;
		try{
			String word;
			buffer = new BufferedReader(new FileReader(filePath));
			int index = 0;
			while( (word = buffer.readLine()) != null){
				
				assertEquals(word, list.words.get(index));
				index++;
			}
		}catch(IOException e){
			e.printStackTrace();
		} finally{
			try{
				if(buffer != null){
					buffer.close();
				} 
			} catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void testCombineLists() {
		String[] l1 = {"a","ab","b","bad", "bda"};
		String[] l2 = {"aa", "ab", "ba", "cat"};
		String[] l3 = {"a","aa","ab", "b","ba","bad","bda","cat"};
		WordList list1 = new WordList(l1);
		WordList list2 = new WordList(l2);
		WordList combinedLists = new WordList(l3);
		list1.combineLists(list2);
		
		//tests
		assertEquals(list1.words.size(), combinedLists.words.size());
		
		for(int i = 0; i < combinedLists.words.size(); i++){
			assertEquals(list1.words.get(i), combinedLists.words.get(i));			
		}
	}

}
