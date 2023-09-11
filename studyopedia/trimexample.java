package studyopedia;

public class trimexample {
	public static String trim (String str) {
		String trimmed=str.trim();
				return trimmed;
	}
	 public static void main(String[] args) {
	        String input = "  Hello, World!  ";
	        String trimmed = trim(input);
	        System.out.println(trimmed); 
	    }

}
