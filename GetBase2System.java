import java.util.*;

public class Answer implements Base2SystemInterface{


  int binary_number = 0;
public String GetBase2System(int num){  

   int a;
   a=1;
  
 while (num>0){
 
   binary_number+=(num%2)*a;
 
  a*=10;
   
 num= num/2;
 }

 String mm = Integer.toString(binary_number);
return mm;
   }     
        
 public static void main(String []args){

	Answer obj = new Answer();
	
  System.out.println(obj.GetBase2System(10));
}
}
