package conditional;

import java.util.*;

public class teamaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of tea required in KG: ");
        float tea = scanner.nextFloat();
        
        System.out.print("Enter the ratio of sugar to tea: ");
        double sugarRatio = scanner.nextDouble();
        
        System.out.print("Enter the ratio of water to tea: ");
        double waterRatio = scanner.nextDouble();
        
        System.out.print("Enter the ratio of tea leaves to tea): ");
        double teaLeaveRatio = scanner.nextDouble();
        
        double sugar = sugarRatio * tea;
        double water = waterRatio * tea;
        double teaLeaves = teaLeaveRatio * tea;
        
        scanner.close();
        
        System.out.println("-------------TEA MAKER-------------");
        System.out.println("REQUIREMENTS FOR " + tea + " KG TEA");
        System.out.println("SUGAR: " + sugar + " KG");
        System.out.println("WATER: " + water + " KG");
        System.out.println("TEA LEAVES: " + teaLeaves + " KG");
    }
}
