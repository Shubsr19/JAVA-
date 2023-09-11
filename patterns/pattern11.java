package patterns;

public class pattern11 {
	public void patternPrint11(int n) 
	 { 
	 int space=2*(n-1); 
	 for(int i=1;i<=n;i++) 
	 { 
	 for(int j=1;j<=i;j++) 
	 { 
	 System.out.print(j); 
	 } 
	 for(int k=1;k<=space;k++) 
	 { 
	 System.out.print(" "); 
	 
	 } 
	 
	 for(int p=i;p>=1;p--) 
	 { 
	 System.out.print(p); 
	 } 
	 System.out.println(); 
	 space=space-2; 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern11().patternPrint11(5); 
	 } 


}
