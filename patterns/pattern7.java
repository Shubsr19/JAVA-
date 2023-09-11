package patterns;

public class pattern7 {
	public void patternPrint7(int n) 
	 { 
	 for (int i=0; i<n; i++) 
	 { 
	 for (int j=0;j<n-i-1; j++) 
	 { 
	 
	 System.out.print(" "); 
	 } 
	 for (int j=0; j<2*i+1; j++ ) 
	 { 
	 
	 System.out.print("*"); 
	 } 
	
	 System.out.println(); 
	 } 
	 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern7().patternPrint7(5); 
	 } 

}
