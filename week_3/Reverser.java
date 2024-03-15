import java.util.Scanner;

public class Reverser {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        
	        String[] words = sentence.split(" ");
	        StringBuilder reversedSentence = new StringBuilder();
	        
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();
	            reversedSentence.append(reversedWord).append(" ");
	        }
	        
	        System.out.println("Reversed sentence:");
	        System.out.println(reversedSentence.toString().trim());
	    }
	}
