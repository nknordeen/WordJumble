package solver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WordList {
	public ArrayList<String> words;
	
	
	/**
	 * Each file that will be passed to this has a single word on each line, 
	 * and I am creating an arraylist out of the words, and preserving the alphabetical order.
	 * @param file - path to file that is read
	 */
	public WordList(String file){
		this.words = new ArrayList<String>();
		BufferedReader buffer = null;
		try{
			String word;
			buffer = new BufferedReader(new FileReader(file));
			while( (word = buffer.readLine()) != null){
				words.add(word.toLowerCase());
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
	
	/**
	 * Merely a constructor used to test smaller cases.
	 * @param list
	 */
	public WordList(String[] list) {
		this.words = new ArrayList<String>(Arrays.asList(list));
	}
	
	/**
	 * Inserts a word keeping the alphabetical order. 
	 * @param word
	 */
	public void insert(String word){
		if(word != null){
			word = word.toLowerCase();
			for(int i = 0; i < this.words.size(); i++){
				if(this.words.get(i).compareToIgnoreCase(word) == 0 ){
					this.words.set(i, word);
					return;
				}
				if(this.words.get(i).compareToIgnoreCase(word) > 0 ){
					this.words.add(i, word);
					return;
				}
					
			}
			this.words.add(word);
		}
		
	}
	
	/**
	 * Adds the list of words to this certain instance.  
	 * Doesn't keep them in alphabetical order, because it doesn't need to be.
	 * @param list
	 */
	public void combineLists(WordList list){
		this.words.addAll(list.words);
	}
	
	/**
	 * Combines a list with a new file.
	 * @param list
	 * @param filePath
	 */
	public void combineLists(String filePath){
		WordList wl = new WordList(filePath);
		this.combineLists(wl);
	}
	

}
