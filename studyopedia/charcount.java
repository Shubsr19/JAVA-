package studyopedia;

public class charcount {
    public static int charCount(String str) {
        int charCountCount = str.length(); 
        return charCountCount;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int charCount = charCount(input);
        System.out.println(charCount);
    }

}
