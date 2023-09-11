package studyopedia;

public class freqwa {
	public static int frequencyWord(String str, String word) {
    String[] words = str.split("\\s+");
    int count = 0;
    for (String w : words) {
        if (w.equals(word)) {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
    String input = "i love my  country india is beautiful country";
    String wordToCount = "country";
    int frequency = frequencyWord(input, wordToCount);
    System.out.println("Frequency of '" + wordToCount + "': " + frequency);
}

}
