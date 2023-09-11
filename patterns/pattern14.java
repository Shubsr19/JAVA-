package patterns;

public class pattern14 {
	public void patternPrint14() 
	 { 
	 for(int i=0;i<=5;i++) 
	 { 
	 for(int j=65;j<=70-i;j++) 
	 { 
	 System.out.print((char)j+" "); 
	 } 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern14().patternPrint14(); 
	 } 

}
