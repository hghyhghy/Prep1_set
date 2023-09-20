
import java.util.*;


public class S3 
{
       
   // to reverse a string  without string inbuilt function 

   public static void main(String[] args) 
   
   {
       
     String str= "Subham";

     StringBuilder str2= new StringBuilder();

     str2.append(str);

     str2= str2.reverse();

     System.out.println("The reversed String is " + " " + str2);

   }

}
