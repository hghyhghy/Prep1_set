
import java.util.*;



public class S9 

{
       
  public static void main(String[] args) 
  
  {

         //  without using replaceAll() method 
  
       String str= " Hello  My  Name   is   Subham   Sarkar";

       char[] chars= str.toCharArray();


       StringBuilder sb= new StringBuilder();

       for(int i=0; i<chars.length; i++)
       {

              if((chars[i]!=' ') && (chars[i]!='\t'))
              {

                       sb.append(chars[i]);

              }
       }

       System.out.println(sb);

  }

}
