
import java.util.*;

public class S6 

{

// using boolean 
       
   public static void main(String[] args)
   
   {

       int num, temp;

       boolean isPrime= true;

       Scanner sc= new Scanner(System.in);

        num = sc.nextInt();

        sc.close();

        for(int i=2; i<=num/2; i++)
        {
              temp= num%i;

              if(temp==0)
              {
                     isPrime=false;
                     break;
              }
        }

        if(isPrime)
        System.out.println("The number is prime number");

        else

        System.out.println("The number is not a prime number");

       
   }

}
