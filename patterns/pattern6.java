package patterns;

public class pattern6 {
	public void patternPrint6(int n) 
	 { 
	 for(int i=0;i<n;i++) 
	 { 
	 for(int j=1;j<=n-i;j++) 
	 { 
	 System.out.print(j); 
	 } 
	 System.out.println(); 
	 } 
	 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern6().patternPrint6(6); 
	 } 

}
