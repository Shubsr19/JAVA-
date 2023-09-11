package studyopedia;

public class replacestring {
    public static void main(String[] args) {
        String originalString = "i love j my country";
        String searchString = "j";
        String replacementString = "t";

        String result = replace(originalString, searchString, replacementString);
        System.out.println("Result: " + result);
    }

    public static String replace(String str, String str1, String str2) {
        String replacedString = str.replace(str1, str2);
        return replacedString;
    }
}
