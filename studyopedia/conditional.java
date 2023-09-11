package studyopedia;

public class conditional {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println("Number is greater than 5");
        }

      
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        
        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else if (number < 10) {
            System.out.println("Number is less than 10");
        } else {
            System.out.println("Number is equal to 10");
        }
    }
}
