package studyopedia;

public class compare {
	public static int myCompare(String str1, String str2) {
	    return str1.compareTo(str2);
	}
	public static void main(String[] args) {
	    String str1 = "apple";
	    String str2 = "banana";
	    
	    int result = myCompare(str1, str2);
	    
	    if (result < 0) {
	        System.out.println(str1 + " is less than " + str2);
	    } else if (result > 0) {
	        System.out.println(str1 + " is greater than " + str2);
	    } else {
	        System.out.println(str1 + " is equal to " + str2);
	    }
	}

}
