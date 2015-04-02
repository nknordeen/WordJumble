package solver;

import java.util.HashMap;
import java.util.Set;

public class LetterCount {
	HashMap<Character, Integer> letters;
	
	public LetterCount(String word){
		this.letters = new HashMap<Character, Integer>();
		if(word != null){
			for(int i = 0; i < word.length(); i++){
				
				if( this.letters.containsKey(word.charAt(i)) ){
					int count = this.letters.get(word.charAt(i));
					this.letters.put(word.charAt(i), count+1);
				}
				else{
					this.letters.put(word.charAt(i), 1);
				}
			}
		}
	}
	
	public boolean hasLessOrEqualLetters(String word){
		LetterCount compare = new LetterCount(word);
		Set<Character> keySet = compare.letters.keySet();
		for(char letter: keySet){
			int compareCount = compare.letters.get(letter);
			if(this.letters.containsKey(letter)){
				int myCount = this.letters.get(letter);
				if(compareCount > myCount){
					return false;
				}
			}
			else{
				return false;
			}
		}
		return true;
	}
}
