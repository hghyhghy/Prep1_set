

import java.util.*;



public class S8 

{

         public static void main(String[] args) 
         
         {
              
                String str1= "Hello My Name   Is Subham    Sarkar";


                System.out.println(str1);


                // using replaceAll() method 


                String str2= str1.replaceAll("\\s", "");

                System.out.println("Now it becomes " + ">> " + str2);

         }

}
