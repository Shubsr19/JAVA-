package patterns;

public class pattern10 {
	public void patternPrint10(int n) 
	 { 
	 for(int i=1;i<=n;i++) 
	 { 
	 int start=1; 
	 if(i%2==0) 
	 { 
	 start=0; 
	 } 
	 else 
	 { 
	 start=1; 
	 } 
	 for(int j=1;j<=i;j++) 
	 { 
	 System.out.print(start+" "); 
	 start=1-start; 
	 
	 } 
	 System.out.println(); 
	 } 
	 } 
	 public static void main(String []args) 
	 { 
	 new pattern10().patternPrint10(5); 
	 } 


}
