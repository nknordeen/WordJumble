package solver;

import java.util.ArrayList;

public class Jumble {
	String jumble;
	LetterCount letters;
	WordList wordList;
	
	/**
	 * combine all the english word files so that I have a more complete list of words.
	 * @param word
	 */
	public Jumble(String word){
		this.jumble = word;
		String path = "/home/nicholas/Downloads/wordlists/";
		this.letters = new LetterCount(word);
		this.wordList = new WordList(path + "english-words.10.txt");
		this.wordList.combineLists(path + "english-words.20.txt");	
		this.wordList.combineLists(path + "english-words.35.txt");		
		this.wordList.combineLists(path + "english-words.40.txt");	
		this.wordList.combineLists(path + "english-words.50.txt");	
		this.wordList.combineLists(path + "english-words.55.txt");	
		this.wordList.combineLists(path + "english-words.60.txt");	
		this.wordList.combineLists(path + "english-words.70.txt");	
		this.wordList.combineLists(path + "english-words.80.txt");	
		this.wordList.combineLists(path + "english-words.95.txt");	
	}
	
	/**
	 * this is a constructor used for simple testing
	 * @param word
	 * @param wordList - will be a much smaller input, where I can control it's contents
	 */
	public Jumble(String word, String[] wordList){
		this.jumble = word;
		this.letters = new LetterCount(word);
		this.wordList = new WordList(wordList);
	}
	
	/**
	 * Returns a list of words that can be created from my jumble string.
	 * There are a lot of words in the lists that don't seem real, but are actually in the files.
	 * @return list of words
	 */
	public ArrayList<String> getAllWords(){
		ArrayList<String> matchedWords = new ArrayList<String>();
		for(int i = 0; i<wordList.words.size(); i++){
			if( letters.hasLessOrEqualLetters(wordList.words.get(i)) ){
				matchedWords.add(wordList.words.get(i));
			}
		}
		return matchedWords;
	}
}
