
import java.util.*;

public class S10 

{

         // to find to largest element in an array

         public static void main(String[] args)
         
         {
              
               int array[]={ 100,45, 34, 99, 89, 23, 90};

               int largest=0;

               int secondlargest=0;

               System.out.println("THE  GIVEN ARRAY IS :");

               for(int i=0; i<array.length;i++)
               {
                     System.out.println(array[i]);
               }

               for(int i=0; i<array.length;i++)
               {

               if(array[i]>largest)
               {
                     secondlargest=largest;

                     largest= array[i];

               }

               else  if(array[i]>secondlargest)

               {
                     secondlargest=array[i] ;
               }


              }

              System.out.println("Highest Number is " + " " + largest);

                            System.out.println("Highest Number is " + " " + secondlargest);



         }

}
