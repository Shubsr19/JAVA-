package patterns;

public class pattern21 {
	public void patternPrint17(int n) 
	 { 
	 for(int i=0;i<n;i++) 
	 { 
	 for(int j=0;j<n;j++) 
	 { 
	 if(i==0 || j==0 || i==n-1 || j==n-1) 
	 { 
	 System.out.print("*"); 
	 } 
	 else 
	 { 
	 System.out.print(" "); 
	 } 
	 } 
	 System.out.println(); 
	 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern21().patternPrint17(5); 
	 } 

}
