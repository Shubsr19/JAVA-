package patterns;

class pattern1 
{ 
 public void patternPrint1(int n) 
 { 
 for(int i=0;i<n;i++) 
 { 
 for(int j=0;j<n;j++) 
 { 
 System.out.print("*"); 
 } 
 System.out.println(); 
 } 
 } 
 public static void main(String []args) 
 { 
 new pattern1().patternPrint1(5); 
 } 
} 