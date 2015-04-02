package solver;

import java.util.ArrayList;
import java.util.Scanner;

public class SolveJumble {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string, to un jumble. Just letters, and no spaces.");
		String userInput = in.nextLine();
		while( !hasOnlyLetters(userInput) ){
			System.out.println("Please use only letters, and no spaces");
			userInput = in.nextLine();
		}
		System.out.println("We will look for all the possible words that can be created using these letters.");
		Jumble myJumble = new Jumble(userInput);
		ArrayList<String> allWords = myJumble.getAllWords();
		System.out.println("Here are all the words");
		for(String word: allWords){
			System.out.println(word);
		}
		in.close();
		System.out.println("Thanks");
	}
	public static boolean hasOnlyLetters(String word){
		for(int i = 0; i < word.length(); i++){
			if( !Character.isLetter(word.charAt(i)) ){
				return false;
			}
		}
		return true;
	}

}
