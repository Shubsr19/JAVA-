package patterns;

public class pattern20 {
	public void patternPrint17(int n) 
	 { 
	 int space=2*(n-1); 
	 for(int i=1;i<=2*n-1;i++) 
	 { 
	 
	 int star=i; 
	 if(i>n) 
	 { 
	 star=2*n-i; 
	 } 
	 for(int j=1;j<=star;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 for(int j=1;j<=space;j++) 
	 { 
	 System.out.print(" "); 
	 } 
	 for(int j=1;j<=star;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 System.out.println(); 
	 if(i<n) 
	 { 
	 space=space-2; 
	 } 
	 else 
	 { 
	 space=space+2; 
	 } 
	 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern20().patternPrint17(5); 
	 } 

}
