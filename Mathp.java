import java.util.*;
import java.math.*;

public class Mathp{
  String d_type="int";   // "int" - integer, "String" - String, "BigInteger" - BigInteher,"long" - long 
  Mathp(){
	  
  } 
  Mathp(String s){
    d_type=s; 
  }
   
   // prime checker for integer numbers
   boolean primecheck(int num){
    if(num==0 || num==1)
    return false;
    int m=num/2;
	boolean flag=true;
	for(int i=2;i<=m;i++){
	   if(num%i==0)
		   flag=false;
	   }
	   return flag;
   
   }
   
     // prime checker for long numbers
    boolean primecheck(long num){
    if(num==0 || num==1)
    return false;
    long m=num/2;
	boolean flag=true;
	for(long i=2;i<=m;i++){
	   if(num%i==0)
		   flag=false;
	   }
	   return flag;
   
   }
   
   // prime checker for Big Integer numbers
   static  boolean primecheck(BigInteger num){
     BigInteger ONE = new BigInteger("1");
	 BigInteger ZERO = new BigInteger("0");
	 if(num.equals(ZERO) || num.equals(ONE))
		 return false;
         BigInteger m = num.divide(BigInteger.valueOf(2));
	     boolean flag=true;
	     BigInteger i = new BigInteger("2");
		 
		 
	    while(dpc(i,m)){
	      if(num.remainder(i).equals(ZERO)){
		   flag=false;
		  break;
		  }
	     i=i.add(ONE); 
		
	   }
	   return flag;
    }
	
	static boolean dpc(BigInteger i,BigInteger m){
	  int n=  i.compareTo(m);
	  boolean flag = false;
	  if(n==0)
		  return true;
	  else if(n==-1)
		  return true;
	  
	  return false;
	   
	}
}
