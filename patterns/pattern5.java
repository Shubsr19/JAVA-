package patterns;

public class pattern5 {
	public void patternPrint5(int n) 
	 { 
	 for(int i=0;i<n;i++) 
	 { 
	 for(int j=0;j<n-i;j++) 
	 { 
	 System.out.print("*"); 
	 } 
	 System.out.println(); 
	 } 
	 } 
	public static void main(String []args) 
	 { 
	 new pattern5().patternPrint5(6); 
	 } 

}
