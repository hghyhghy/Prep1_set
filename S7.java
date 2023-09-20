

import java.util.*;

public class S7 

{
       
   // program to iterate through an arraylist using while  loop , advance for loop  and for loop


   public static void main(String[] args)
   
   {
       
      ArrayList<Integer> list= new ArrayList< Integer>();

      list.add(98);

      list.add(108);

      list.add(58);

      list.add(68);

      list.add(88);

      System.out.println("The size of the list is ");

      int s= list.size();

      System.out.println(s);

      System.out.println("while loop");

      Iterator itr= list.iterator();

      while (itr.hasNext())
      {
       System.out.println(itr.next());
      }


      System.out.println("Advance for loop'");

      for(Object obj: list)
      {
       System.out.println(obj);
      }

      System.out.println("For loop'");

      for(int i=0; i<list.size(); i++)
      {
       System.out.println(list.get(i));
      }
      
   }

}
