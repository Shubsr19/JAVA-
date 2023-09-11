package patterns;

public class pattern17 {
	public void patternPrint16() 
	 { 
	 for(int i=0;i<5;i++) 
	 { 
	 char print='E'; 
	 for(int j=0;j<=i;j++) 
	 { 
	 System.out.print(print+" "); 
	 print=(char)(70-j); 
	 } 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern17().patternPrint16(); 
	 }

}
