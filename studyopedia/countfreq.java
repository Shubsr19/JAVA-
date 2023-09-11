package studyopedia;

public class countfreq {  
	public static int frequenceCount(String str, char ch) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
    String input = "i am iitarun tyagi";
    char characterToCount = 'i';
    int frequency = frequenceCount(input, characterToCount);
    System.out.println("Frequency of '" + characterToCount + "': " + frequency); // Output: 3
}

}
