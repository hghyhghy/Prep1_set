

 import java.util.HashMap;

public class S5 

{

       // counting the number of words in  a string using hashmap

       public static void main(String[] args) 
       
       {
              
         String str="My my  name is  is Subham Subham";

         String []  token = str.split(" ");

         HashMap<String,Integer>  h1= new HashMap<String,Integer>();

         for(int i=0; i<token.length ; i++)
         {
  
               if (h1.containsKey(token[i]))
               {
                     int count= h1.get(token[i]);

                     h1.put(token[i], count+1);
               }
               else
               {
                     h1.put(token[i] , 1);
               }

         }

         System.out.println(h1);



       }
       
}