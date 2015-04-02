# WordJumble
Prompt: Can you create a program to solve a word jumble? (More info here.) The program should accept a string as input, and then return a list of words that can be created using the submitted letters. 
For example, on the input "dog", the program should return a set of words including "god", "do", and "go".

I appended the first two .txt files that I was supplied, because for my algorithm, I didn't need for them to be in order. I only used the first two english word files, because there were too many single letter words being returned, and the solution didn't match the example in the prompt.

I created a class to count all the letters.  For example "apple" there is one 'a' two 'p's one 'l' and one 'e'.
I then took the list of words I was given, and compared the number of letters in that word, to my input word.  If the letters were less than or equal to the letters in my input word, I had a match for a word.

To execute, run the main method in SolveJumble.java
