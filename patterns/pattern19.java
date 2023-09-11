package patterns;

public class pattern19 {
	public void patternPrint17(int n) 
	 { 
	 int space=0; 
	 for(int i=1;i<=n;i++) 
	 { 
	 
	 for(int j=0;j<=n-i;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 for(int j=0;j<space;j++) 
	 { 
	 System.out.print(" "); 
	 } 
	 for(int j=0;j<=n-i;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 space=space+2; 
	 System.out.println(); 
	 } 
	 space=8; 
	 for(int i=0;i<n;i++) 
	 { 
	 
	 for(int j=0;j<=i;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 for(int j=0;j<space;j++) 
	 { 
	 System.out.print(" "); 
	 } 
	 for(int j=0;j<=i;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 space=space-2; 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern19().patternPrint17(5); 
	 } 


}
