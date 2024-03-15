import java.util.HashMap;
import java.util.Map;

public class Punctuation {

	public static void main(String[] args) {
		 String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
	        
	        Map<Character, Integer> punctuationCounts = new HashMap<>();
	        
	        for (char c : text.toCharArray()) {
	            if (isPunctuation(c)) {
	                punctuationCounts.put(c, punctuationCounts.getOrDefault(c, 0) + 1);
	            }
	        }
	        
	        System.out.println("Punctuation Marks Count:");
	        for (Map.Entry<Character, Integer> entry : punctuationCounts.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	    
	    public static boolean isPunctuation(char c) {
	    	 return c == '.' || c == ',' || c == '-' || c == '!' || c == '?' || c == ';';
	    }
	}
	    

	
