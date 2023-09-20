
import java.util.*;


public class S4 
{

       // reversing a string without inbuild function 
       
   public static void main(String[] args)
   
   {
       
      String str;

      Scanner sc= new Scanner(System.in);

      str=sc.nextLine();

      String []  token= str.split("");

      for(int i=token.length-1; i>=0; i--)

      {

          System.out.println("THE REVERSED STRING IS " + " " + token[i]);

      }

   }

}
