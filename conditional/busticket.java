package conditional;

import java.util.*;
public class busticket {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("ENTER MAXIMUM SEAT AVAILABLE FOR JOURNEY -");

	        int maxLimit = scanner.nextInt();

	        System.out.print("ENTER THE NUMBER OF PASSENGER FOR AD :-");
	        int AD = scanner.nextInt();
	        if (maxLimit - AD >= 0) {
	            System.out.println("REMAINING TICKET FOR AC " + (maxLimit - AD));
	            System.out.print("ENTER THE NUMBER OF PASSENGER FOR AC:-");
	            int AC = scanner.nextInt();
	            if (maxLimit - AC - AD >= 0) {
	                System.out.println("REMAINING TICKET FOR AB " + (maxLimit - AD - AC));
	                System.out.print("ENTER THE NUMBER OF PASSENGER FOR AB:-");
	                int AB = scanner.nextInt();
	                if (AB + AC + AD == maxLimit) {
	                    System.out.println("SEAT IS FULL NO SEAT AVAILABLE");
	                } else if (AB + AC + AD < maxLimit) {
	                    System.out.println((maxLimit - AB - AC - AD) + " SEAT IS LEFT FOR LAST STOPAGE");
	                }
	            } else {
	                System.out.println("YOU ENTER EXCEEDED LIMIT FOR AC");
	            }
	        } else {
	            System.out.println("YOU ENTER OVER LIMIT FOR AD");
	        }
	    }
	}