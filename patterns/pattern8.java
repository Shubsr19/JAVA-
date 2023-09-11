package patterns;

public class pattern8 {
	public void patternPrint8(int n) 
	 { 
	 for (int i=0; i<n; i++) 
	 { 
	 for (int j=0;j<i; j++) 
	 { 
	 
	 System.out.print(" "); 
	 } 
	 for (int j=0; j<2*n-(2*i+1); j++ ) 
	 { 
	
	 System.out.print("*"); 
	 } 
	 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern8().patternPrint8(5); 
	 }

}
