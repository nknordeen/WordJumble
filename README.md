# WordJumble
Can you create a program to solve a word jumble? (More info here.) The program should accept a string as input, and then return a list of words that can be created using the submitted letters. 
For example, on the input "dog", the program should return a set of words including "god", "do", and "go".

I appended all the .txt files that I was supplied, because for my algorithm, I didn't need for them to be in order. 

I created a class to count all the letters.  For example "apple" there is one 'a' two 'p's one 'l' and one 'e'.
I then took the list of words I was given, and compared the number of letters in that word, to my input word.  If the letters were less than or equal to the letters in my input word, I had a match for a word.
