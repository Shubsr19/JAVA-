package patterns;

public class pattern4 {
	public void patternPrint4(int n) 
	 { 
	 for(int i=1;i<=n;i++) 
	 { 
	 for(int j=1;j<=i;j++) 
	 { 
	 System.out.print(i); 
	 } 
	 System.out.println(); 
	 } 
	 } 
	public static void main(String []args) 
	 { 
	 new pattern4().patternPrint4(6); 
	 } 

}
