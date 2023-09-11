package patterns;

public class pattern15 {
	public void patternPrint15() 
	 { 
	 for(int i=65;i<=70;i++) 
	 { 
	 for(int j=65;j<=i;j++) 
	 { 
	 System.out.print((char)i+" "); 
	 } 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern15().patternPrint15(); 
	 } 

}
